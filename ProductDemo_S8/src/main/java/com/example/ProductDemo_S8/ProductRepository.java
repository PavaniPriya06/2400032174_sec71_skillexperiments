package com.example.ProductDemo_S8;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.*;
public interface ProductRepository extends JpaRepository<Product,Integer> {

	//	a. findByCategory(String category) 
		    List<Product> findByCategory(String category);
	
	// b. findByPriceBetween(double min, double max)
		    List<Product> findByPriceBetween(double min, double max);
		    
	//a. Sorting products by price 
	//DBMS:select * from product order by price ASC/DESC	    
		    @Query("select p from Product p order by p.price ASC")
		    List<Product> getByPrice();
		    
	//b. Fetching products above a price value
	//DBMS: select * from product where price>uservalue	    
		    @Query("select p from Product p where p.price>:price")
		    List<Product> getAbovePrice(@Param("price") float price);
		    
	//c. Fetching products by category
	//DBMS: select * from product where category=usercategory	    
		   @Query("select p from Product p where p.category=:category")
		   List<Product> getByCategory(@Param("category") String category);
		    
		    
		    
		    
		    
		    
		    
		    
}
