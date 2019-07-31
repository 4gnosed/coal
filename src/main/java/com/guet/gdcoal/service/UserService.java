package com.guet.gdcoal.service;

import java.util.List;

import com.guet.gdcoal.model.Company;
import com.guet.gdcoal.model.User;

public interface UserService {
	public User getUserById(Integer id);

	public User login(String username, String password);

	public String getPasswordByUserId(Integer userId);

	public int updatePasswordByUserId(Integer userId, String password);

	public int addUser(User user);

	public List<User> getAllUser();

	public int deleteUserByUserId(Integer userId);

	public int alterUser (User user);
}
