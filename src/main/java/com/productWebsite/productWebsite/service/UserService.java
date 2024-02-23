package com.productWebsite.productWebsite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.productWebsite.productWebsite.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<com.productWebsite.productWebsite.entity.User> getAllUser(){
		return userRepository.findAll();
	}

}
