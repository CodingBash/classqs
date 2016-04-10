package com.classqs.webapplication.delegates;

import org.springframework.stereotype.Component;

import com.classqs.webapplication.models.Course;

@Component
public class CourseDelegateImpl implements CourseDelegate
{

	@Override
	public Course getCourse(String id)
	{
		return new Course();
	}

	@Override
	public void addCourse(String id, Course course)
	{

	}
}
