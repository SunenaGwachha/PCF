package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	
	
	@PostMapping(value="/addproduct")
	public Product addProduct(@RequestBody @Valid Product product) {
		return productService.save(product);
	}
	
	@GetMapping(value="/getproducts")
	public List<Product> getAll(){
		return productService.getAll();
	}	
	
	@GetMapping(value="/getbyid/{id}")
	public Product getById(@PathVariable Long id){
		return productService.getById(id);
	}	

}
