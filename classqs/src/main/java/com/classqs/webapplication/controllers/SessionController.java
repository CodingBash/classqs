/**
 * 
 */
package com.classqs.webapplication.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.classqs.webapplication.constants.ErrorConstants;
import com.classqs.webapplication.delegates.CourseDelegate;
import com.classqs.webapplication.delegates.SessionDelegate;
import com.classqs.webapplication.models.Course;
import com.classqs.webapplication.models.Session;

/**
 * @author Bash
 *
 */
public class SessionController extends BaseController
{
	@Autowired
	private SessionDelegate sessionDelegate;

	@Autowired
	private CourseDelegate courseDelegate;

	@RequestMapping("/session")
	public ModelAndView index(String courseId)
	{
		ModelAndView mav = new ModelAndView("sessionIndex");

		if (courseId == null || courseId.length() == 0)
		{
			mav.addObject("sessionError", ErrorConstants.error1x000001);
			return mav;
		}

		List<Session> sessions = sessionDelegate.getSessions(courseId);
		Course course = courseDelegate.getCourse(courseId);

		mav.addObject("courseId", courseId);
		mav.addObject("courseName", course.getCourseName());

		// TODO: Determine if teacher
		mav.addObject("isTeacher", false);

		mav.addObject("sessionList", sessions);
		return mav;

	}

	@RequestMapping("/session/details/{id}")
	public ModelAndView details(@PathVariable("id") String id)
	{
		ModelAndView mav = new ModelAndView("details");
		if (id == null || id.length() == 0)
		{
			mav.addObject("sessionError", ErrorConstants.error1x000001);
			return mav;
		}

		Session session = sessionDelegate.findSession("id");

		if (session == null)
		{
			mav.addObject("sessionError", ErrorConstants.error1x000002);
		}

		mav.addObject("session", session);
		return mav;
	}

	@RequestMapping("/session/create")
	public ModelAndView create(String courseId)
	{
		ModelAndView mav = new ModelAndView("create");

		if (courseId == null || courseId.length() == 0)
		{
			mav.addObject("sessionError", ErrorConstants.error1x000001);
			return mav;
		}

		Course course = courseDelegate.getCourse(courseId);

		mav.addObject("courseId", courseId);
		mav.addObject("courseName", course.getCourseName());

		return mav;
	}

	// TODO: Finish SessionController methods
}
