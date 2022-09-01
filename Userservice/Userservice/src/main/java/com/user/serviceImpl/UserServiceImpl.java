package com.user.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.model.User;
import com.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	// user list
	List<User> list = List.of(
			new User(112L,"Tushyap","898988787"),
			new User(113L,"Shivam","898988787"),
			new User(114L,"Vishu","898988787")
			);

	@Override
	public User getUser(Long id) {
	
		return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}



}
