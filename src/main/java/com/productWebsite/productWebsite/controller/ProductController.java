package com.productWebsite.productWebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.productWebsite.productWebsite.entity.Product;
import com.productWebsite.productWebsite.entity.myProductList;
import com.productWebsite.productWebsite.service.ProductService;
import com.productWebsite.productWebsite.service.myProductListService;


@Controller
public class ProductController {
	
	@Autowired
	private ProductService service;
		
	@Autowired
	private myProductListService myProductService;
	
	
@GetMapping("/")
public String home() {
	return"home";
}
@GetMapping("/product_register")
	public String productRegister() {
	return"productregister";
}
@GetMapping("/available_products")
public ModelAndView getAllProduct() {
	List<Product>list=service.getAllProduct();
	return new ModelAndView("productList","product", list);
}
@PostMapping("/save")
public String addProduct(@ModelAttribute Product b) {
	service.save(b);
	return "redirect:/available_products";
}
@GetMapping("/my_product")
public String getmyproduct(Model model) {
	List<myProductList>list=myProductService.getAllProduct();
	model.addAttribute("product",list);
	return "myproduct";
}
@RequestMapping("/mylist/{id}")
public String getMyList(@PathVariable("id") int id) {
	Product b=service.getProductById(id);
	myProductList mb=new myProductList(b.getId(),b.getName(),b.getBrand(),b.getPrice());
	myProductService.savemyProduct(mb);
	return "redirect:/my_product";
}
@RequestMapping("/editProduct/{id}")
public String editProduct(@PathVariable("id") int id,Model model) {
	Product b =service.getProductById(id);
	model.addAttribute("product",b);
	return "productEdit";
}
@RequestMapping("/deleteProduct/{id}")
public String deleteProduct(@PathVariable("id")int id) {
	service.deleteById(id);
	return"redirect:/available_products";
}
}
