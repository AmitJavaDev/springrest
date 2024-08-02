package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.Contact;
import com.springrest.springrest.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getCourseById(long course_id);

	public Course addCourse(Course course);

	public void deleteCourse(long course_id);

	public void contactUs(Contact contact);
}
