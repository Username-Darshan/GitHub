package com.jspiders.car_project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.car_project.POJO.PersonregPOJO;
import com.jspiders.car_project.Repository.PersonregRepository;

@Service
public class PersonregService {
	
	@Autowired
	private PersonregRepository repository;

	public PersonregPOJO register(String name, String email, long contact, String address, int cid, String date, String gender, String city) {
		PersonregPOJO person=repository.register(name,email,contact,address,cid,date,gender,city);
		return person;
	}

	public List<PersonregPOJO> showdata() {
		List<PersonregPOJO> persons=repository.showdata();
		return persons;
	}

	public PersonregPOJO removereg(int id) {
		PersonregPOJO person=repository.removereg(id);
		return person;
	}

	public PersonregPOJO findreg(int id) {
		PersonregPOJO person=repository.findreg(id);
		return person;
	}

	public PersonregPOJO update(int id, String name, String email, long contact, String address, String city,
			String gender, int cid) {
		
		PersonregPOJO person=repository.update(id,name,email,contact,address,city,cid,gender);
		
		return person;
	}

}
