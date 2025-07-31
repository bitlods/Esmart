package com.Tharun.Product.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Tharun.Product.Entity.product;
import com.Tharun.Product.Service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService sev;
	
	@GetMapping("/form")
	public String productForm(Model model) {
		product p=new product();
		model.addAttribute("employee", p);
		return "Product-form";	
	}

}
