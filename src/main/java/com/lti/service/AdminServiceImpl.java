package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Admin;
import com.lti.repository.AdminRepository;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository adminRepo;

	@Override
	public List<Admin> getAllRetailers() {
		return adminRepo.findAll();
	}

	@Override
	public Admin addRetailers(Admin admretailers) {
		return adminRepo.save(admretailers);
	}

	@Override
	public boolean deleteRetailer(int retid) {
		adminRepo.deleteById(retid);
		return true;
	}
}
