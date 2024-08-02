package com.springrest.springrest.entities;

public class Course {

	public long course_id;
	public String course_name;
	public String course_desc;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int course_id, String course_name, String course_desc) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_desc = course_desc;
	}
	public long getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_desc() {
		return course_desc;
	}
	public void setCourse_desd(String course_desc) {
		this.course_desc = course_desc;
	}
	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", course_name=" + course_name + ", course_desc=" + course_desc + "]";
	}
	
	
	
}
