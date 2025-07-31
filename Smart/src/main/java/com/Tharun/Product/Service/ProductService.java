package com.Tharun.Product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tharun.Product.Entity.product;
import com.Tharun.Product.Repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo repo;
	

	public void saveProduct(product product) {
		repo.save(product);
	}

	public List<product> getAllEmployee() {
		return repo.findAll();
	}
}
