package com.jspiders.car_project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.car_project.POJO.car_projectPOJO;
import com.jspiders.car_project.Repository.car_projectRespository;

@Service
public class car_projectService {
	@Autowired
	private car_projectRespository repository;

	public car_projectPOJO addcars(String name,String price, int year, String color, String mileage) {
		car_projectPOJO car=repository.addcars(name,price,year,color,mileage);
		return car;
	}

	public car_projectPOJO searchcar(int cid) {
		car_projectPOJO car=repository.searchcar(cid);
		return car;
	}

	

	

}
