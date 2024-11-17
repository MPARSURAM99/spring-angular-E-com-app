package com.cutm.main.service;

import com.cutm.main.exception.CartItemException;
import com.cutm.main.exception.UserException;
import com.cutm.main.modal.Cart;
import com.cutm.main.modal.CartItem;
import com.cutm.main.modal.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
