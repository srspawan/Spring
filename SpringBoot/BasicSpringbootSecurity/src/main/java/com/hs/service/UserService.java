package com.hs.service;

import com.hs.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
