package com.productWebsite.productWebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productWebsite.productWebsite.entity.myProductList;
@Repository
public interface myProductRepository extends JpaRepository<myProductList,Integer> {

}
