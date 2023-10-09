package com.jspiders.SpringREST.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.SpringREST.POJO.StudentPOJO;
import com.jspiders.SpringREST.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	public StudentPOJO addStudent(StudentPOJO pojo) {
		StudentPOJO student = repository.addStudent(pojo);
		return student;
	}
	public StudentPOJO searchStudent(int id) {
		StudentPOJO student = repository.searchStudent(id);
		return student;
	}
	public List<StudentPOJO> searchallstudent() {
		
		 List<StudentPOJO> students= repository.searchallstudents();
		return students;
	}
	public StudentPOJO removestudent(int id) {
		StudentPOJO student= repository.removestudent(id);
		return student;
	}
	public StudentPOJO updatestudent(StudentPOJO pojo) {
		StudentPOJO student=repository.updatestudent(pojo);
		return student;
	}
	
	

}
