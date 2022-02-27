package org.kdcoder.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.kdcoder.entity.Users;
import org.kdcoder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import io.kdcoder.springbootstarter.topic.Topic;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		ArrayList<Users> users = new ArrayList<Users>();
		userRepository.findAll().
			forEach(users :: add);
		return users;
	}

	public Optional<Users> getUser(int userId) {
		// TODO Auto-generated method stub
		 return userRepository.findById(userId);
	}

	public Object addUser(Users user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public void updateUser(Users user, int userId) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		userRepository.deleteById(userId);
	}
}