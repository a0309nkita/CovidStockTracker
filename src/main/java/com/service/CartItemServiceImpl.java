package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CartItemDao;
import com.model.Cart;
import com.model.CartItem;

@Service
public class CartItemServiceImpl implements CartItemService {

  @Autowired
  private CartItemDao cartItemDao;

  public CartItemDao getCartItemDao() {
    return cartItemDao;
  }

  public void setCartItemDao(CartItemDao cartItemDao) {
    this.cartItemDao = cartItemDao;
  }

  public void addCartItem(CartItem cartItem) {
    cartItemDao.addCartItem(cartItem);

  }

  public void removeCartItem(String CartItemId, String operation) {
    cartItemDao.removeCartItem(CartItemId, operation);
  }

  public void removeAllCartItems(Cart cart, String operation) {
    cartItemDao.removeAllCartItems(cart, operation);
  }

}
