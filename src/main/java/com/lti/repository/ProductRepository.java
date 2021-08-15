package com.lti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lti.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	//public List<Product> getAllProduct();
	
	//@Query("Select p from Product p where p.category = ?1 ") // <-
	public List<Product> findByCategory(String category);

	@Query("Select p from Product p where p.name LIKE %?1% ") // <-
	public List<Product> findByName(String name);

	@Query("Select p from Product p where p.price BETWEEN ?1 AND ?2") // <-
	public List<Product> findProductByPrice(int lower, int upper);
}
