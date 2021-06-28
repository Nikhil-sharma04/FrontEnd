package com.nagarro.training.dao;

import com.nagarro.training.dto.User;

/**
 * Deals with User Login related queries like getting details, updating password
 * and signup.
 * 
 * @author nikhilsharma05
 *
 */
public interface LoginDao {

	User getUserDetails(String username);

	void updatePassword(String username, String password);

	void signup(User user);
}
