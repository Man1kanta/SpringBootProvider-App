package com.mnt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mnt.model.User;
import com.mnt.service.UserManagementServiceImpl;

@RestController
public class UserManagementController 
{
	
	@Autowired
	UserManagementServiceImpl service;
	
	@GetMapping("/sample")
	public String sample()
	{
		return "the project build  is working fine";
	}
	
	@PostMapping("/save")
	public String saveUser(@RequestBody User user)
	{
		return service.saveUser(user);
	}
	
	@GetMapping("/getOne/{id}")
	public User getOneUserRecord(@PathVariable("id") Integer id)
	{
		return service.getUserById(id);
	}
	
	@GetMapping("/all")
	public List<User> getAllUsers()
	{
		return service.getAllUsers();
	}
	
	@PutMapping("/update/{id}/{address}")
	public User updateUserAddress(@PathVariable("id") Integer id,@PathVariable("address")String address)
	{	
		return service.updateUser(id, address);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") Integer id)
	{
		return service.deleteUser(id);
	}

}
