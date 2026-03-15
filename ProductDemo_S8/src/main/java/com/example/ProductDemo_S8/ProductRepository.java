package com.example.ProductDemo_S8;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;
public interface ProductRepository extends JpaRepository<Product, Long> {
 // Derived Query Methods
	// Derived Query Methods
	 List<Product> findByCategory(String category);
	 List<Product> findByPriceBetween(double min, double max);
	 // JPQL Queries
	 // a) Sorting by price
	 @Query("SELECT p FROM Product p ORDER BY p.price ASC")
	 List<Product> findAllSortedByPrice();
	 // b) Products above price
	 @Query("SELECT p FROM Product p WHERE p.price > :price")
	 List<Product> findProductsAbovePrice(@Param("price") double price);
	 // c) Products by category using JPQL
	 @Query("SELECT p FROM Product p WHERE p.category = :category")
	 List<Product> findProductsByCategoryJPQL(@Param("category") String category);
}