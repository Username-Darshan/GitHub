package com.jspiders.car_project.Repository;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.jspiders.car_project.POJO.car_projectPOJO;


@Repository
public class car_projectRespository {
	
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	
	
	public static void openConnection() {
		factory=Persistence.createEntityManagerFactory("carproject");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
	}

	public static void closeConnection() {
		if(factory != null) {
			factory.close();
		}
		if(manager != null) {
			manager.close();
		}
		if(transaction != null) {
			if(transaction.isActive()) {
				transaction.rollback();
			}
		}
	}
	public car_projectPOJO addcars(String name,String price, int year, String color, String mileage) {
		openConnection();
		transaction.begin();
		
		car_projectPOJO car=new car_projectPOJO();
		car.setName(name);
		car.setPrice(price);
		car.setYear(year);
		car.setColor(color);
		car.setMileage(mileage);
		
		manager.persist(car);
		
		transaction.commit();
		closeConnection();
		return car;
	}

	public car_projectPOJO searchcar(int cid) {
		openConnection();
		transaction.begin();
		
		car_projectPOJO car=manager.find(car_projectPOJO.class, cid);
		
		transaction.commit();
		closeConnection();
		return car;
	}

	

	

}
