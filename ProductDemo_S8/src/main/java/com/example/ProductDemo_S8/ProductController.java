package com.example.ProductDemo_S8;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	private final ProductService service;
	 public ProductController(ProductService service) {
	 this.service = service;
	 }
	 // a) Category search
	 @GetMapping("/category/{category}")
	 public List<Product> getByCategory(@PathVariable String category) {
	 return service.getByCategory(category);
	 }
	 // b) Price range filter
	 @GetMapping("/filter")
	 public List<Product> filterByPrice(@RequestParam double min,
	 @RequestParam double max) {
	 return service.filterByPrice(min, max);
	 }
	 // c) Sorted by price
	 @GetMapping("/sorted")
	 public List<Product> getSortedProducts() {
	 return service.getSortedProducts();
	 }
	 // d) Expensive products
	 @GetMapping("/expensive/{price}")
	 public List<Product> getExpensiveProducts(@PathVariable double price) {
	 return service.getExpensiveProducts(price);
	 } 

}

    