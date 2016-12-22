package com.niit.securitybackend.dao;

import java.util.List;

import com.niit.securitybackend.model.User;

public interface UserDAO {

	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public User getUserById(int id);
	public User getUserByUsername(String username);
	public List<User> listUsers();
}
