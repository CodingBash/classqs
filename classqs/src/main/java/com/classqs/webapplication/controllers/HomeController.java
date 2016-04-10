package com.classqs.webapplication.controllers;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/")
public class HomeController extends BaseController
{

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Return landing page
	 */
	@RequestMapping(value =
	{ "/landing", "/", "index", "home" }, method = RequestMethod.GET)
	public ModelAndView home(HttpSession session)
	{
		ModelAndView mav = new ModelAndView("index");
		bindLandingModules(mav);
		bindContentToView(mav);

		Object studentId = session.getAttribute("studentName");
		if (studentId != null && studentId instanceof String)
		{
			mav.addObject((String) studentId);
		}

		return mav;
	}

	private void bindLandingModules(ModelAndView mav)
	{

	}
}
