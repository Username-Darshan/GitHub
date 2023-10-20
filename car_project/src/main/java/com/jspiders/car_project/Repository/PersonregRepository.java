package com.jspiders.car_project.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.jspiders.car_project.POJO.PersonregPOJO;

@Repository
public class PersonregRepository {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static Query query;
	
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


	public PersonregPOJO register(String name, String email, long contact, String address, int cid, String date, String gender, String city) {
		openConnection();
		transaction.begin();
		
		PersonregPOJO person=new PersonregPOJO();
		person.setName(name);
		person.setEmail(email);
		person.setContact(contact);
		person.setAddress(address);
		person.setCid(cid);
		person.setDate(date);
		person.setGender(gender);
		person.setCity(city);
		
		manager.persist(person);
		
		transaction.commit();
		closeConnection();
		
		return person;
	}


	public List<PersonregPOJO> showdata() {
		
		openConnection();
		transaction.begin();
		
		String jpql="from PersonregPOJO";
		query=manager.createQuery(jpql);
		@SuppressWarnings("unchecked")
		List<PersonregPOJO> persons=query.getResultList();
		
		
		transaction.commit();
		closeConnection();
		
		
		return persons;
	}


	public PersonregPOJO removereg(int id) {
		openConnection();
		transaction.begin();
		
		PersonregPOJO person=manager.find(PersonregPOJO.class, id);
		if(person != null) {
			
			manager.remove(person);
		}
		
		transaction.commit();
		closeConnection();
		
		return person;
	}


	public PersonregPOJO findreg(int id) {
		openConnection();
		transaction.begin();
		
		PersonregPOJO person=manager.find(PersonregPOJO.class, id);
		
		transaction.commit();
		closeConnection();
		return person;
	}


	public PersonregPOJO update(int id, String name, String email, long contact, String address, String city, int cid,
			String gender) {
		
		openConnection();
		transaction.begin();
		
		PersonregPOJO person=manager.find(PersonregPOJO.class, id);
		person.setName(name);
		person.setAddress(address);
		person.setEmail(email);
		person.setContact(contact);
		person.setCity(city);
		person.setCid(cid);
		person.setGender(gender);
		
		transaction.commit();
		closeConnection();
		return person;
	}
	
}
