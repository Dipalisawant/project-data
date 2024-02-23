package com.productWebsite.productWebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.productWebsite.productWebsite.service.myProductListService;

@Controller
public class myProductListController {
	
	@Autowired
	private myProductListService service;
	
	@RequestMapping("/deletemyList/{id}")
	public String deletemyList(@PathVariable("id")int id) {
		service.deleteById(id);
		return "redirect:/my_product";
	}

	
}
