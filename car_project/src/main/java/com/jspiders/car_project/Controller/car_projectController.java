package com.jspiders.car_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.jspiders.car_project.POJO.AdminPOJO;
import com.jspiders.car_project.POJO.car_projectPOJO;
import com.jspiders.car_project.Service.car_projectService;

@Controller
public class car_projectController {
	
	@Autowired
	private car_projectService service;

	@GetMapping("/carlist")
	public String carlisting(@SessionAttribute(name="login", required = false) AdminPOJO admin,ModelMap map) {
		
		if(admin != null) {
			return "Car_listing";
		}
		
		map.addAttribute("msg", "session inactive. login to proceed");
		return"Login";
		
		
		
		
	}
	
	@GetMapping("/Home")
	public String home(@SessionAttribute(name="login", required = false) AdminPOJO admin,ModelMap map) {
		
		if(admin != null) {
			return "Home";
		}
		
		map.addAttribute("msg", "session inactive. login to proceed");
		return"Login";
		
		
		
		
		
	}
	
	@GetMapping("/Mustang")
	public String mustang(@SessionAttribute(name="login", required = false) AdminPOJO admin,ModelMap map) {
		
		if(admin != null) {
			return "mustang";
		}
		
		map.addAttribute("msg", "session inactive. login to proceed");
		return"Login";
		
		
		
		
	}
	@GetMapping("/SRT")
	public String SRT(@SessionAttribute(name="login", required = false) AdminPOJO admin,ModelMap map) {
		
		if(admin != null) {
			return "SRT";
		}
		
		map.addAttribute("msg", "session inactive. login to proceed");
		return"Login";
		
		
		
		
	}
	@GetMapping("/Rolls-Royce")
	public String Rolls(@SessionAttribute(name="login", required = false) AdminPOJO admin,ModelMap map) {
		
		if(admin != null) {
			return "Rolls-Royce";
		}
		
		map.addAttribute("msg", "session inactive. login to proceed");
		return"Login";
		
		
		
		
	}
	
	@GetMapping("/Bently")
	public String Bently(@SessionAttribute(name="login", required = false) AdminPOJO admin,ModelMap map) {
		
		if(admin != null) {
			return "Bently";
		}
		
		map.addAttribute("msg", "session inactive. login to proceed");
		return"Login";
		
		
		
		
	}
	@GetMapping("/Bugati")
	public String Bugati(@SessionAttribute(name="login", required = false) AdminPOJO admin,ModelMap map) {
		
		if(admin != null) {
			return "Bugati";
		}
		
		map.addAttribute("msg", "session inactive. login to proceed");
		return"Login";
		
		
		
		
	}
	@GetMapping("/Lamborgini")
	public String Lambo(@SessionAttribute(name="login", required = false) AdminPOJO admin,ModelMap map) {
		
		if(admin != null) {
			return "Lamborgini";
		}
		
		map.addAttribute("msg", "session inactive. login to proceed");
		return"Login";
		
		
		
		
	}
	
	
	
	
	@SuppressWarnings("unused")
	@PostMapping("/addcars")
	public String addcars(@SessionAttribute(name="login", required = false) AdminPOJO admin,@RequestParam String name,@RequestParam String price, @RequestParam int year, @RequestParam String color, @RequestParam String mileage, ModelMap map) {
		
		if(admin != null) {
			car_projectPOJO car=service.addcars(name,price,year,color,mileage);
			String carname=car.getName();
			//Success 
			if(car != null) {
				 
				 map.addAttribute("msg", "car is ready to service and id is : ");
				 int cid=car.getId();
				 
				map.addAttribute("cid",cid);
				 return carname;
			 }
			//Failure
			map.addAttribute("msg", "car is not ready");
			return carname;
		}
		
		map.addAttribute("msg", "session inactive. login to proceed");
		return"Login";
		
		
		
		
		
	}
	
	@PostMapping("/srcar")
	public String searchcar(@SessionAttribute(name="login", required = false) AdminPOJO admin,@RequestParam int cid,ModelMap map) {
		
		if(admin != null) {
			car_projectPOJO car=service.searchcar(cid);
			if(car != null) {
				map.addAttribute("car",car);
				return "perRegistration";
			}
			map.addAttribute("msg","no car is available");
			return "perRegistration";
		}
		
		map.addAttribute("msg", "session inactive. login to proceed");
		return"Login";
		
		
		
		
		
	}
}
