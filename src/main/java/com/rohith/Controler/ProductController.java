package com.rohith.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.rohith.binding.Product;
import com.rohith.repo.ProductRepostiory;

import jakarta.persistence.Entity;
import jakarta.validation.Valid;

@Controller
public class ProductController {
	@Autowired
	private ProductRepostiory productRepo;
	@GetMapping("/")
  public String getProductForm(Model model) {
	  Product p=new Product();
	  model.addAttribute("product",p);
	  return "Product";
	  
	  
	  
	}
	@PostMapping("/product")
	public String handleFormData(@Valid Product product,BindingResult res, Model model) {
		     if(res.hasErrors())
			return "Product";
		     productRepo.save(product);
			System.out.println(product);
			model.addAttribute("msg","product is saved successfully");
		    return "success";
		
	}
	
}
