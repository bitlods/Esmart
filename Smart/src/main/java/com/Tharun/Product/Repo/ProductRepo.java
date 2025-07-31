package com.Tharun.Product.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Tharun.Product.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
