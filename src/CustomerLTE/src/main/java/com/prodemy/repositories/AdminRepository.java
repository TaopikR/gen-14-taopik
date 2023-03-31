package com.prodemy.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.prodemy.models.Admin;

public interface AdminRepository extends CrudRepository<Admin, String> {
	@Query(value = "SELECT a FROM Admin a WHERE a.username = :unm")
	public Admin getAdmin(String unm);

}

