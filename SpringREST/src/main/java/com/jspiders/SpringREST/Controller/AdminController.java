package com.jspiders.SpringREST.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.SpringREST.POJO.AdminPOJO;
import com.jspiders.SpringREST.Service.AdminService;
import com.jspiders.SpringREST.response.AdminResponse;

@RestController
public class AdminController {
	@Autowired
	private AdminService service;
	
	@PostMapping(path ="/createaccount", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AdminResponse> createaccount(@RequestBody AdminPOJO pojo){
		
		AdminPOJO admin=service.createaccount(pojo);
		
		//Success
		if(admin != null) {
			return new ResponseEntity<AdminResponse>(new AdminResponse("account created successfully", admin), HttpStatus.ACCEPTED);
		}
		
		return new ResponseEntity<AdminResponse>(new AdminResponse("account not created", null), HttpStatus.NOT_ACCEPTABLE);
		
	}
	
	@PostMapping(path = "/login",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AdminResponse> login(@RequestBody AdminPOJO pojo){
		AdminPOJO admin = service.login(pojo);
		
		//SUCCESS
		if (admin != null) {
			return new ResponseEntity<AdminResponse>(new AdminResponse("Login successful. ", admin), HttpStatus.OK);
		}
		
		//FAILURE
		return new ResponseEntity<AdminResponse>(new AdminResponse("Login failed. ", null), HttpStatus.NOT_FOUND);
	}
}
