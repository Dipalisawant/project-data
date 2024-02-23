package com.productWebsite.productWebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productWebsite.productWebsite.entity.User;
import com.productWebsite.productWebsite.service.UserService;
@Controller
public class UserController {
	@Autowired
	private  UserService userService;
	@GetMapping("/users") 
	public String getAllUsers(Model model) {
		model.addAttribute("users",userService.getAllUser());
		return"user-list";
	}

}
