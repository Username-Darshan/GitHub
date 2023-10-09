package com.jspiders.SpringREST.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.SpringREST.POJO.AdminPOJO;
import com.jspiders.SpringREST.Repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository repository;
	public AdminPOJO createaccount(AdminPOJO pojo) {
		AdminPOJO admin=repository.createaccount(pojo);
		return admin;
	}
	public AdminPOJO login(AdminPOJO pojo) {
		AdminPOJO admin=repository.login(pojo);
		return admin;
	}

}
