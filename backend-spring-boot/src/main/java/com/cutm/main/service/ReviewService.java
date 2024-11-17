package com.cutm.main.service;

import java.util.List;

import com.cutm.main.exception.ProductException;
import com.cutm.main.modal.Review;
import com.cutm.main.modal.User;
import com.cutm.main.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
