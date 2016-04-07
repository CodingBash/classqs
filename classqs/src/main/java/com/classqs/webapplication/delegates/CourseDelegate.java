package com.classqs.webapplication.delegates;

import org.springframework.stereotype.Component;

import com.classqs.webapplication.models.Course;

@Component
public class CourseDelegate
{

	public Course getCourse(String id){
		return new Course();
	}
	
	public void addCourse(String id, Course course){
		
	}
}
