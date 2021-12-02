package com.mnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mnt.model.User;
import com.mnt.repo.IUserManagementRepo;

@Service
public class UserManagementServiceImpl implements IUserManagementService{

	@Autowired
	IUserManagementRepo repo;
	
	
	@Override
	public String saveUser(User user) {
		if (repo.existsById(user.getId()))
			return "The user with the id:" + user.getId() + " already exists";
		else
			repo.save(user);
		return "User successfully saved wit the id:: " + user.getId();
	}

	@Override
	public String deleteUser(Integer id) {
		if(repo.existsById(id))
		{
			repo.deleteById(id);
		    return "uesr successfully removed";
		}
			else
		return "There is no User with the ID::"+id ;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = (List<User>) repo.findAll();
		return users;
	}

	@Override
	public User getUserById(Integer id) {
		if (repo.existsById(id))
			return repo.findById(id).get();
		else
			return null;
	}

	@Override
	public User updateUser(Integer id, String address) {
		if (repo.existsById(id)) {
			repo.updateUser(id, address);
			return repo.findById(id).get();
		} else
			return null;
	}

}
