package com.productWebsite.productWebsite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productWebsite.productWebsite.entity.Order;
import com.productWebsite.productWebsite.repository.OrderRepository;



@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order>getAllOrders(){
		return orderRepository.findAll();
	}

	public Object getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
