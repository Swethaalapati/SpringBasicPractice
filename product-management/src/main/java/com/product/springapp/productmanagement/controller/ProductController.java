package com.product.springapp.productmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.springapp.productmanagement.model.Product;
import com.product.springapp.productmanagement.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping(value = "/product/add")
	public boolean addProduct(@RequestBody Product pd)
	{
		
		return productService.addProduct(pd);
		
	}
	
	@GetMapping(value = "/product/get/{id}")
	public Product getProduct(@PathVariable int id)
	{
		return productService.getProductById(id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/product/get")
	public List<Product> getProduct(@RequestParam(required = true) String keyword) {
		
		return productService.getProductByKeyword(keyword);
	}
	
	@PutMapping(value = "/product/update/{id}")
	public Product updateProduct(@RequestBody Product pd, @PathVariable int id) {
		
		return productService.updateProduct(pd, id);
	}
	
	@DeleteMapping(value = "/product/delete/{id}")
	public boolean deleteCompany(@PathVariable int id) {
		
		return productService.deleteProduct(id);
	}

}
