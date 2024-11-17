package com.cutm.main.service;

import com.cutm.main.exception.ProductException;
import com.cutm.main.modal.Cart;
import com.cutm.main.modal.CartItem;
import com.cutm.main.modal.User;
import com.cutm.main.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
