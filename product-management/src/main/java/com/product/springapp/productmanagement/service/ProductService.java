package com.product.springapp.productmanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.product.springapp.productmanagement.model.Product;

@Service
public class ProductService {
	
	private List<Product> listOfProducts = new ArrayList();

	public boolean addProduct(Product pd) {
		
		for(Product p : listOfProducts) {
			
			if(p.getId() == pd.getId()) {
				
				return false;
			}
		}
		
		listOfProducts.add(pd);
		return true;
		
	}

	public Product getProductById(int id) {
		
		for(Product p : listOfProducts) {
			
			if(p.getId() == id) {
				
				return p;
			}
		}
		return null;
	}

	public List<Product> getProductByKeyword(String keyword) {
		
		List<Product> list = new ArrayList();
		
		if(keyword.isEmpty()) {
			
			return listOfProducts;
		}
		else {
			
			for(Product p : listOfProducts) {
				
				if(p.toString().contains(keyword)) {
					
					list.add(p);
				}
			}
		}
		return list;
	}

	public Product updateProduct(Product pd, int id) {
		
		deleteProduct(id);
		addProduct(pd);
		
		return pd;
	}

	public boolean deleteProduct(int id) {

		Product pr = null;
		boolean flag = false;
		
		for(Product p : listOfProducts) {
			
			if(p.getId() == id) {
				
				pr = p;
				flag = true;
				
			}
		}
		if(flag) {
			
			listOfProducts.remove(pr);
			return true;
		}
		return false;
	}

}
