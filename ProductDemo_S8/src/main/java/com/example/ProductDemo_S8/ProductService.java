package com.example.ProductDemo_S8;

import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ProductService {

	private final ProductRepository repo;
	 public ProductService(ProductRepository repo) {
	 this.repo = repo;
	 }
	 public List<Product> getByCategory(String category) {
	 return repo.findByCategory(category);
	 }
	 public List<Product> filterByPrice(double min, double max) {
	 return repo.findByPriceBetween(min, max);
	 }
	 public List<Product> getSortedProducts() {
	 return repo.findAllSortedByPrice();
	 }
	 public List<Product> getExpensiveProducts(double price) {
	 return repo.findProductsAbovePrice(price);
	 }
	} 
