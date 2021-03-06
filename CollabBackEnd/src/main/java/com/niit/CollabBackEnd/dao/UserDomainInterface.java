package com.niit.CollabBackEnd.dao;

import java.util.List;

import com.niit.CollabBackEnd.model.User_Domain;
public interface UserDomainInterface 
{
	
	public boolean addUser(User_Domain user);
	public List<User_Domain> listUsers();
	public User_Domain getUsername(String username, String password);
	public User_Domain getUsernamed(String username);
	public User_Domain getEmailid(String email,String password);
	public boolean isExistingUser(User_Domain user);

}
