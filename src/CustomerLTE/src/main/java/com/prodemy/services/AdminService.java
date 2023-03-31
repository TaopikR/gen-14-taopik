package com.prodemy.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.prodemy.models.Admin;
import com.prodemy.repositories.AdminRepository;

@Service
@Transactional
public class AdminService {
	@Autowired
	AdminRepository repo;
	public void save(Admin an) {
		repo.save(an);
	}
	
	public Admin getAdmin(String username) {
		return repo.getAdmin(username);
	}
}
