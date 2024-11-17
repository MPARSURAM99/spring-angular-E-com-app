package com.cutm.main.service;

import java.util.List;

import com.cutm.main.exception.UserException;
import com.cutm.main.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public List<User> findAllUsers();

}
