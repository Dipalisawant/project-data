package com.productWebsite.productWebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productWebsite.productWebsite.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
