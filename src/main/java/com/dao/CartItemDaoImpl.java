package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Cart;
import com.model.CartItem;
import com.model.Product;

@Repository
@Transactional
public class CartItemDaoImpl implements CartItemDao {

  private ProductDaoImpl productDaoImpl;

  @Autowired
  private SessionFactory sessionFactory;

  public SessionFactory getSessionFactory() {
    return sessionFactory;
  }

  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  public void addCartItem(CartItem cartItem) {
    Session session = sessionFactory.openSession();
    session.saveOrUpdate(cartItem);
    session.flush();
    session.close();
  }

  public void removeCartItem(String CartItemId, String operation) {
    Session session = sessionFactory.openSession();
    CartItem cartItem = (CartItem) session.get(CartItem.class, CartItemId);
    session.delete(cartItem);
    Cart cart = cartItem.getCart();
    List<CartItem> cartItems = cart.getCartItem();
    cartItems.remove(cartItem);
    if (!operation.equals("remove")) {
      Product product = (Product) session.get(Product.class,
          cartItem.getProduct().getProductId());
      double temp = product.getUnitStock() - cartItem.getQuality();
      product.setUnitStock(temp);
      session.update(product);
      if (product.getUnitStock() <= 0) {
        session.delete(product);
      }
    }
    session.flush();
    session.close();
  }

  public void removeAllCartItems(Cart cart, String operation) {
    List<CartItem> cartItems = cart.getCartItem();
    for (CartItem cartItem : cartItems) {

      removeCartItem(cartItem.getCartItemId(), operation);
    }
  }

}
