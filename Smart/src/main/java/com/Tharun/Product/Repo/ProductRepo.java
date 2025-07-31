package com.Tharun.Product.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tharun.Product.Entity.product;

public interface ProductRepo extends JpaRepository<product, Integer> {

}
