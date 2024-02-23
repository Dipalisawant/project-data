package com.productWebsite.productWebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.productWebsite.productWebsite.service.AddressService;

@Controller
public class AddressController {
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/address")
	public String getAllUsers(Model model) {
		model.addAttribute("address",addressService.getAllAddress());
		return"address-list";
		
	}
	

}
