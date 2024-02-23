package com.productWebsite.productWebsite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productWebsite.productWebsite.entity.Product;
import com.productWebsite.productWebsite.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository bRepo;
	
	public void save(Product b) {
		bRepo.save(b);
	}
	public List<Product> getAllProduct(){
		return bRepo.findAll();
	}
	public Product getProductById(int id) {
		return bRepo.findById(id).get();
	}
	public void deleteById(int id) {
		bRepo.deleteById(id);
	}
}
