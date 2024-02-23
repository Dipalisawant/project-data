package com.productWebsite.productWebsite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productWebsite.productWebsite.entity.Address;
import com.productWebsite.productWebsite.repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	private AddressRepository addressRepository;
	
	private List<Address>getAllAddresses(){
		return addressRepository.findAll();
		
	}
	public Address createAddress(Address address) {
		return addressRepository.save(address);
	}
	public Object getAllAddress() {
		// TODO Auto-generated method stub
		return null;
	}

}
