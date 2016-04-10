package com.classqs.webapplication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.classqs.webapplication.models.Course;

// TODO: Complete Rest consumption
public class CourseService
{

	@Autowired
	private RestTemplate restTemplate;

	private String url = "http://localhost:8080/ClassQsService";

	public Course getCourse()
	{
		return restTemplate.getForObject("http://localhost:8080/ClassQsService", Course.class);
	}

	public void addCourse(String id, Course course)
	{
		String url = "http://localhost:8080/ClassQsService";

		restTemplate.postForObject(url, null, null, course, id);
	}
}
