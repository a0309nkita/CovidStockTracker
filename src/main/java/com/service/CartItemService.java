package com.service;

import com.model.Cart;
import com.model.CartItem;

public interface CartItemService {

  void addCartItem(CartItem cartItem);
  void removeCartItem(String CartItemId, String string);
  void removeAllCartItems(Cart cart, String string);
}
