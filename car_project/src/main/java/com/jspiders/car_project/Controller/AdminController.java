package com.jspiders.car_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspiders.car_project.POJO.AdminPOJO;
import com.jspiders.car_project.Service.AdminService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AdminController {

	@Autowired
	private AdminService service;
	
	@GetMapping("/createaccount")
	public String seeaccount(ModelMap map) {
		AdminPOJO pojo=service.getadmin();
		if(pojo != null) {
			map.addAttribute("msg", "Account already exists");
			return "Login";
		}
		return "CreateAccount";
	}
	
	@PostMapping("/createaccount")
	public String createaccount(@RequestParam String username, @RequestParam String password, ModelMap map) {
		
		AdminPOJO pojo=service.createaccount(username,password);
		//success
		if(pojo != null) {
			map.addAttribute("msg", "Account created successfully");
			return "Login";
			
		}
		//failure
		map.addAttribute("msg","account not created");
		return "Login";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password,ModelMap map,HttpSession session) {
			AdminPOJO pojo=service.login(username,password);
			if(pojo != null) {
				session.setAttribute("login", pojo);
				session.setMaxInactiveInterval(100);
				return "Home";
			}
			map.addAttribute("msg", "Invalid username or password..!");
		return null;
	}
	
	@GetMapping("/logout")
	public String logout(ModelMap map, HttpSession session) {
		session.invalidate();
		map.addAttribute("msg","logged out successfully");
		return "Login";
	}
}
