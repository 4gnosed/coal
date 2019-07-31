package com.guet.gdcoal.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guet.gdcoal.dao.UserDao;
import com.guet.gdcoal.model.Company;
import com.guet.gdcoal.model.User;
import com.guet.gdcoal.service.UserService;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUserById(Integer id) {
		return this.userDao.getUserById(id);
	}
	
	@Override
	public User login(String username,String password) {
		return this.userDao.login(username,password);
	}

	@Override
	public String getPasswordByUserId(Integer userId) {
		return this.userDao.getPasswordByUserId(userId);
	}

	@Override
	public int updatePasswordByUserId(Integer userId, String password) {
		return this.userDao.updatePasswordByUserId(userId,password);
	}

	@Override
	public int addUser(User user) {
		return this.userDao.addUser(user);
	}

	@Override
	public List<User> getAllUser() {
		return this.userDao.getAllUser();
	}

	@Override
	public int deleteUserByUserId(Integer userId) {
		return this.userDao.deleteUserByUserId(userId);
	}

	@Override
	public int alterUser (User user ) {
		return this.userDao.alterUser (user );
	}

}
