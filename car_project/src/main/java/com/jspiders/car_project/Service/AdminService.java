package com.jspiders.car_project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.car_project.POJO.AdminPOJO;
import com.jspiders.car_project.Repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository repository;

	public AdminPOJO createaccount(String username, String password) {
		AdminPOJO pojo=repository.createaccount(username,password);
		return pojo;
	}

	public AdminPOJO getadmin() {
		AdminPOJO pojo=repository.getadmin();
		return pojo;
	}

	public AdminPOJO login(String username, String password) {
		AdminPOJO pojo=repository.login(username,password);
		return pojo;
	}
}
