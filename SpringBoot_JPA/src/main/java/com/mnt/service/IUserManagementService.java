package com.mnt.service;

import java.util.List;

import com.mnt.model.User;

public interface IUserManagementService {
	
	public String saveUser(User user);
	
	public String deleteUser(Integer id);
	
	public List<User> getAllUsers();
	
	public User getUserById(Integer id);
	
	public User updateUser(Integer id,String address);

}
