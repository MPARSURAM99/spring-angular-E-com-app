package com.cutm.main.service;

import java.util.List;

import com.cutm.main.exception.ProductException;
import com.cutm.main.modal.Rating;
import com.cutm.main.modal.User;
import com.cutm.main.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
