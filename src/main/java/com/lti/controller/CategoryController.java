package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Admin;
import com.lti.model.Product;
import com.lti.service.AdminService;
import com.lti.service.CategoryService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/categoryRest/api")
public class CategoryController {

	@Autowired
	CategoryService catService;

	@Autowired
	AdminService adminService;

	// To filter the products based on category
	@GetMapping("/findByCategory/{category}") // <- gives correct output
	public List<Product> findByCategory(@PathVariable(value = "category") String category) {
		System.out.println(category);
		return this.catService.findByCategory(category);
	}

	// To filter the products based on price range
	@GetMapping("/findProductByPrice/{lower}/{upper}") // <- gives correct output
	public List<Product> findProductByPrice(@PathVariable String lower, @PathVariable String upper) {
		System.out.println(lower + " " + upper);
		return this.catService.findProductByPrice(Integer.parseInt(lower), Integer.parseInt(upper));
	}

	// To display all the products available
	@GetMapping("/getAll") // <- gives correct output
	public List<Product> getAllProduct() {
		return this.catService.getAllProduct();
	}

	// To filter the products based on names
	@GetMapping("/findByName/{name}") // <- gives correct output
	public List<Product> findByName(@PathVariable(value = "name") String name) {
		System.out.println(name);
		return this.catService.findByName(name);
	}

	// To display all the retailer's details
	@GetMapping("/showRetailers")
	public List<Admin> getAllRetailers() {
		return this.adminService.getAllRetailers();
	}

	//To insert retailer's data
	@PostMapping("/addRetailers")
	public Admin addRetailers(@RequestBody Admin admretailers) {
		return adminService.addRetailers(admretailers);
	}
	
	//To delete retailer's detail
	@DeleteMapping("/adminProfile/{retid}")
	public boolean deleteRetailer(@PathVariable(value = "retid") String retid) {
		System.out.println("Data Deleted of Id:"+retid);
		return adminService.deleteRetailer(Integer.parseInt(retid));
	}
	

}
