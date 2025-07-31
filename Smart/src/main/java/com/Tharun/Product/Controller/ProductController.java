package com.Tharun.Product.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
		model.addAttribute("product", p);
		return "Product-form";	
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute product p,RedirectAttributes attr) {
		sev.saveProduct(p);
		attr.addFlashAttribute("success","Saved Successfully");
		return "redirect:/product/plist";	
	}
	
	@GetMapping("/plist")
    public String  getEmployeeList(Model model) {
    	List<product> plist=sev.getAllEmployee();
    	model.addAttribute("allproduct",plist);
    	return "plist";
    }
}
