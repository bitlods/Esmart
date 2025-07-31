package com.Tharun.Product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tharun.Product.Entity.Product;
import com.Tharun.Product.Repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo repo;
	

	public void saveProduct(Product Product) {
		repo.save(Product);
	}

	public List<Product> getAllEmployee() {
		return repo.findAll();
	}
}
