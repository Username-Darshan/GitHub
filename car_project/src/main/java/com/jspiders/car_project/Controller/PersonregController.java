package com.jspiders.car_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.jspiders.car_project.POJO.AdminPOJO;
import com.jspiders.car_project.POJO.PersonregPOJO;
import com.jspiders.car_project.Service.PersonregService;

@Controller
public class PersonregController {
	
	@Autowired
	private PersonregService service;
	
	@GetMapping("/reg")
	public String reg(@SessionAttribute(name="login", required = false) AdminPOJO admin, ModelMap map) {
		if(admin != null) {
			return "perRegistration";
		}
		
		map.addAttribute("msg", "session inactive. login to proceed");
		return"Login";
		
	}

	@PostMapping("/Reg")
	public String register(@SessionAttribute(name="login", required = false) AdminPOJO admin,@RequestParam String name, @RequestParam String email, @RequestParam long contact, @RequestParam String address,@RequestParam int cid,@RequestParam String date,@RequestParam String gender,@RequestParam String city, ModelMap map) {
		
		if(admin != null) {
			PersonregPOJO person=service.register(name,email,contact,address,cid,date,gender,city);
			
			//Success
			if(person != null) {
				map.addAttribute("msg","registration successful");
				return "perRegistration";
				
				
			}
			//Failure
			map.addAttribute("msg","registration not successful");
			return "perRegistration";
		}
		
		map.addAttribute("msg", "session inactive. login to proceed");
		return"Login";
		
		
	}
	
	@GetMapping("/showdata")
	public String showdata(@SessionAttribute(name="login", required = false) AdminPOJO admin,ModelMap map) {
		
		if(admin != null) {
			List<PersonregPOJO> persons=service.showdata();
			
			if(!persons.isEmpty()) {
				map.addAttribute("persons", persons);
				return "perRegistration";
			}
			map.addAttribute("msg","no data is present");
			return "perRegistration";
		}
		
		map.addAttribute("msg", "session inactive. login to proceed");
		return"Login";
		
		
		
		
	}
	
	@PostMapping("/removereg")
	public String removereg(@SessionAttribute(name="login", required = false) AdminPOJO admin,@RequestParam int id,ModelMap map) {
		
		if(admin != null) {
			PersonregPOJO person=service.removereg(id);
			
			List<PersonregPOJO> persons=service.showdata();
			
			//Success
			if(person != null) {
				map.addAttribute("msg", "person registration remove successfully");
				map.addAttribute("persons", persons);
				return "perRegistration";
				
			}
			//failure
			map.addAttribute("msg", "data not found");
			map.addAttribute("persons", persons);
			return "perRegistration";
		}
		
		map.addAttribute("msg", "session inactive. login to proceed");
		return"Login";
		
		
		
		
		
	}
	
	@PostMapping("/findreg")
	public String findallreg(@SessionAttribute(name="login", required = false) AdminPOJO admin,@RequestParam int id,ModelMap map) {
		
		if(admin != null) {
			PersonregPOJO person=service.findreg(id);
			List<PersonregPOJO> persons=service.showdata();
			
			//success
			if(person != null) {
				map.addAttribute("person", person);
				map.addAttribute("persons", persons);
				return "Updatereg";
				
			}
			return "Updatereg";
		}
		
		map.addAttribute("msg", "session inactive. login to proceed");
		return"Login";
		
		
		
		
	}
	
	@PostMapping("/Updateperson")
	public String updateperson(@SessionAttribute(name="login", required = false) AdminPOJO admin,@RequestParam int id,@RequestParam String name, @RequestParam String email, @RequestParam long contact, @RequestParam String address,@RequestParam int cid,@RequestParam String date,@RequestParam String gender,@RequestParam String city,ModelMap map) {
		
		if(admin != null) {
			PersonregPOJO person=service.update(id,name,email,contact,address,city,gender,cid);	
			
			//success
			if(person != null) {
				List<PersonregPOJO> persons=service.showdata();
				map.addAttribute("msg", "Data updated successfully");
				map.addAttribute("person", person);
				map.addAttribute("persons", persons);
				return "Updatereg";
			}
			//failure
			List<PersonregPOJO> persons=service.showdata();
			map.addAttribute("msg", "Data  not updated");
			map.addAttribute("person", person);
			map.addAttribute("persons", persons);
			return "Updatereg";
		}
		
		map.addAttribute("msg", "session inactive. login to proceed");
		return"Login";
		
		
		
		
		
		
		
	}
	
}
