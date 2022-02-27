package org.kdcoder.controller;

import java.util.List;
import java.util.Optional;

import org.kdcoder.entity.Users;
import org.kdcoder.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/users")
	public List<Users> getAllUsers() { 
		return userService.getAllUsers();
	}
	
	@RequestMapping("/users/{userId}")
	public Optional<Users> getUser(@PathVariable int userId) {
		return userService.getUser(userId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	public void addUser(@RequestBody Users user) {
		if(user != null) {
			userService.addUser(user);
		}else {
			System.out.print("*****************************************User object is null*********************************");
		}
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/users/{userId}")
	public void updateUser(@RequestBody Users user, @PathVariable int userId) {
		userService.updateUser(user, userId);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{userId}")
	public void deleteUser(@PathVariable int userId) {
		userService.deleteUser(userId);
	}
}