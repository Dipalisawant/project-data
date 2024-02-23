package com.productWebsite.productWebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.productWebsite.productWebsite.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/orders")
	public String getAllUsers(Model model) {
		model.addAttribute("orders",orderService.getAllUsers());
		return "order-list";
	}

}
