package com.guet.gdcoal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guet.gdcoal.model.Company;
import com.guet.gdcoal.model.User;

public interface UserDao {

	public User getUserById(int id);

	public User login(@Param("username") String username, @Param("password") String password);

	public Company findUserCompany(Integer companyId);

	public String getPasswordByUserId(Integer userId);

	public int updatePasswordByUserId(@Param("userId")Integer userId, @Param("password")String password);

	public List<Company> findAllCompany();

	public int addUser(User user);

	public List<User> getAllUser();

	public int deleteUserByUserId(@Param("userId")Integer userId);

	public int alterUser(User user );

}
