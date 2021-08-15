package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Product;
import com.lti.repository.ProductRepository;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	ProductRepository categoryRepo;// <-

	@Override
	public List<Product> findByName(String name) {
		return categoryRepo.findByName(name);// <-
	}
	@Override
	public List<Product> findByCategory(String category) {
		return categoryRepo.findByCategory(category);// <-
	}

	@Override
	public List<Product> findProductByPrice(int lower, int upper) {
		return categoryRepo.findProductByPrice(lower, upper);// <-
	}

	@Override
	public List<Product> getAllProduct() {
		return categoryRepo.findAll();
	}

}
