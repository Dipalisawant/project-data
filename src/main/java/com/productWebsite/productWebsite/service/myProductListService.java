package com.productWebsite.productWebsite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productWebsite.productWebsite.entity.myProductList;
import com.productWebsite.productWebsite.repository.myProductRepository;

@Service
public class myProductListService {

@Autowired
		 private myProductRepository myproduct;
	
	
	public void savemyProduct(myProductList product) {
		myproduct.save(product);
	}
	public List<myProductList> getAllProduct(){
		return myproduct.findAll();
	}
public void deleteById(int id) {
	myproduct.deleteById(id);
}
	
}
