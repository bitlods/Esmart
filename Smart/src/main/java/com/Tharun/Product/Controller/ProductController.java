package com.Tharun.Product.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.Tharun.Product.Entity.Product;
import com.Tharun.Product.Service.ProductService;


@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService sev;
	
	@GetMapping("/form")
	public String productForm(Model model) {
		Product p=new Product();
		model.addAttribute("product", p);
		return "product-form";	
	}

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute Product p,RedirectAttributes attr) {
		sev.saveProduct(p);
		attr.addFlashAttribute("success","Saved Successfully");
		return "redirect:/product/plists";	
	}
	
	@GetMapping("/plists")
    public String  getEmployeeList(Model model) {
    	List<Product> plist=sev.getAllEmployee();
    	model.addAttribute("allproduct",plist);
    	return "plist";
    }
}
