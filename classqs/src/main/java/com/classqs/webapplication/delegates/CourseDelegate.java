package com.classqs.webapplication.delegates;

import com.classqs.webapplication.models.Course;

public interface CourseDelegate
{
	public Course getCourse(String id);
	
	public void addCourse(String id, Course course);
}
