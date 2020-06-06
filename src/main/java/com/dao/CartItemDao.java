package com.dao;

import com.model.Cart;
import com.model.CartItem;

public interface CartItemDao {

  void addCartItem(CartItem cartItem);
  void removeCartItem(String CartItemId, String operation);
  void removeAllCartItems(Cart cart, String operation);

}
