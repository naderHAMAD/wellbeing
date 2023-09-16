package tn.Spring.Service;

import java.util.List;

import tn.Spring.Entity.Role;
import tn.Spring.Entity.User;

public interface IServiceUser {
	List<User> retrieveAllUsers();

	User addUser (User u);

	void deleteUser (int id);

	User updateUser (User u);

	User retrieveUser (int id);
	
	Role SaveRole (Role role);
	//void AddRoleToUser (String RoleName, String username); 
	User getUser (String username); 
	List<User> getAllUsers (); 


}
