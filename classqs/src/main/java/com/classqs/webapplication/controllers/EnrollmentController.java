package com.classqs.webapplication.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.classqs.webapplication.constants.ErrorConstants;
import com.classqs.webapplication.delegates.CourseDelegate;
import com.classqs.webapplication.models.Course;
import com.classqs.webapplication.models.Enrollment;

public class EnrollmentController extends BaseController
{

	@Autowired
	private CourseDelegate courseDelegate;

	@RequestMapping(value = "Enrollment/Enroll/{id}")
	public ModelAndView enroll(@PathVariable(value = "id") String id, HttpSession session)
	{
		ModelAndView mav = new ModelAndView("enroll");
		if (id == null || id.length() == 0)
		{
			mav.addObject("enrollError", ErrorConstants.error1x001);
			return mav;
		}

		Course course = courseDelegate.getCourse(id);
		Enrollment enrollment = new Enrollment();
		enrollment.setCourseId(course.getCourseId());

		// TODO: Get StudentID from SecurityContext
		Object studentId = session.getAttribute("studentId");
		if (studentId != null && studentId instanceof String)
		{
			String convertedStudentId = (String) studentId;
			enrollment.setStudentId(convertedStudentId);
		} else
		{
			mav.addObject("enrollError", ErrorConstants.error1x002);
			return mav;
		}

		// TODO: Add enrollment within enrollmentDelegate

		return mav;
	}
}
