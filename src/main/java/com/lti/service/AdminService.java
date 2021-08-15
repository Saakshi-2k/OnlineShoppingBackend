package com.lti.service;

import java.util.List;

import com.lti.model.Admin;

public interface AdminService {

	public List<Admin> getAllRetailers();

	public Admin addRetailers(Admin admretailers);

	public boolean deleteRetailer(int retid);
}
