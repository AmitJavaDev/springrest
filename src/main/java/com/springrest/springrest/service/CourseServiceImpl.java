package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Contact;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	List<Contact> contactList;
	
	public CourseServiceImpl() {
		list= new ArrayList<Course>();
		list.add(new Course(144,"JAVA","Java course for developer"));
		list.add(new Course(122,"PHP","PHP course for new engg"));
		list.add(new Course(141,"Python","Python for extra one"));
		list.add(new Course(555,"React-Js","For atrractive Front end"));
		
		contactList= new ArrayList<Contact>();
		contactList.add(new Contact(99,"amit", "rana","amit@gamil.com",6757654785L,"I need to know about java course"));
		contactList.add(new Contact(889,"vinit", "raj","raj@gamil.com",7757785785L,"I need to know about python course"));
		
	}
	@Override
	public List<Course> getCourses() {
		
		return list;
	}
	@Override
	public Course getCourseById(long course_id) {
		System.out.println("in service class_get course by id");
		 Course c=null;
		 for(Course course: list) {
			 if(course.getCourse_id()== course_id) {
				 System.out.println(course.getCourse_id());
				 c=course;
			 break;
			 }
		 }
		 return c;
	}
	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}
	@Override
	public void deleteCourse(long course_id) {
		System.out.println("in delete service");
		list.remove(course_id);
	}
	@Override
	public void contactUs(Contact contact) {
		System.out.println("In contact us page");
		
	}

	
}
