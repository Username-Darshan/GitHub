package com.jspiders.SpringREST.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.jspiders.SpringREST.POJO.StudentPOJO;
import com.jspiders.SpringREST.Service.StudentService;
import com.jspiders.SpringREST.response.StudentResponse;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentResponse> addStudent(@RequestBody StudentPOJO pojo){
		StudentPOJO student = service.addStudent(pojo);
		
		//success
		if(student != null) {
			return new ResponseEntity<StudentResponse>(new StudentResponse("Data added successfully", student,null), HttpStatus.ACCEPTED);
			
			
			 
			
		}
		// failure
		return new ResponseEntity<StudentResponse>(new StudentResponse("data not added", null, null), HttpStatus.NOT_ACCEPTABLE);
		
	}
	
	
	@GetMapping(path = "/search/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentResponse> searchStudent(@PathVariable int id){
		StudentPOJO student = service.searchStudent(id);
		
		//SUCCESS
		if (student != null) {
			return new ResponseEntity<StudentResponse>(new StudentResponse("Data found successfully. ", student, null), HttpStatus.FOUND);
		}
		
		//FAILURE
		return new ResponseEntity<StudentResponse>(new StudentResponse("Data not found. ", student, null), HttpStatus.NOT_FOUND);
	}
	
	@GetMapping( path = "/searchall", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentResponse> searchAllStudent(){
		
		List<StudentPOJO> students= service.searchallstudent();
		
		//Success
		if(students.isEmpty() == false) {
			return new ResponseEntity<StudentResponse>(new StudentResponse("data found successfuly",null, students), HttpStatus.FOUND);
		}
		//Failure
		return new ResponseEntity<StudentResponse>(new StudentResponse("data not found",null, null), HttpStatus.NOT_FOUND);
		
	}
	
	@DeleteMapping(path="/remove/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentResponse> removestudent(@PathVariable int id){
		
		StudentPOJO student= service.removestudent(id);
		
		//success
		if(student !=null) {
			return new ResponseEntity<StudentResponse>(new StudentResponse("Data is removed ", student, null),HttpStatus.OK);
		}
		
		//failure
		return new ResponseEntity<StudentResponse>(new StudentResponse("Data is not found", null, null), HttpStatus.BAD_REQUEST);
		
	}
	
	@PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<StudentResponse> updateStudent(@RequestBody StudentPOJO pojo){
		
		StudentPOJO student= service.updatestudent(pojo);
		
		//Success
		if(student != null) {
			return new ResponseEntity<StudentResponse>(new StudentResponse("data updated successfully", student, null),HttpStatus.ACCEPTED);
		}
		
		//Failure
		return new ResponseEntity<StudentResponse>(new StudentResponse("Data not updated", null, null),HttpStatus.NOT_ACCEPTABLE);
		
		
		
		
		
	}

	
}
