package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

import com.springrest.springrest.entities.Contact;
import com.springrest.springrest.entities.Course;
import com.springrest.springrest.service.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService service;

	@GetMapping("/home")
	public String home() {
		return "Welcome to the Courses home page...!!!";
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000",methods = RequestMethod.GET)
	@GetMapping("/courses")
	public List<Course> getCourses(){
		
		return service.getCourses();
	}
	@GetMapping("/courses/{course_id}")
	public Course getCourse(@PathVariable String course_id) {
		 return this.service.getCourseById(Long.parseLong(course_id));
}
	@CrossOrigin(origins = "http://localhost:3000",methods = RequestMethod.POST)
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		
		return this.service.addCourse(course);
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000",methods = RequestMethod.DELETE)
	@DeleteMapping("/courses/{id}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String id){
		try {
			this.service.deleteCourse(Long.parseLong(id));
			System.out.println("deleting one course........");
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch(Exception e) {
			
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@CrossOrigin(origins = "http://localhost:3000",methods = RequestMethod.POST)
	@PostMapping("/contact")
	public  ResponseEntity<HttpStatus> contactUs(@RequestBody Contact contact){
		try {
			this.service.contactUs(contact);
			System.out.println("adding conact to DB........");
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		catch(Exception e) {
			
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		} 
	}
}
