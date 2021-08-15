package com.lti.service;

import java.util.List;

import com.lti.model.Product;

public interface CategoryService {

	public List<Product> getAllProduct();

	public List<Product> findByCategory(String brand);

	public List<Product> findProductByPrice(int lower, int upper);

	public List<Product> findByName(String name);

}