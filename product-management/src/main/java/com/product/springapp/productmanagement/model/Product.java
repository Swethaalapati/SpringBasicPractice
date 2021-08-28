package com.product.springapp.productmanagement.model;

import java.util.Objects;

public class Product {
	
	private int id;
	private String name;
	private double price;
	private double weight;
	private String category;
	
	
	public Product() {
		
		// TODO Auto-generated constructor stub
	}


	public Product(int id, String name, double price, double weight, String category) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.category = category;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public int hashCode() {
		return Objects.hash(category, id, name, price, weight);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", weight=" + weight + ", category="
				+ category + "]";
	}
	
	

}
