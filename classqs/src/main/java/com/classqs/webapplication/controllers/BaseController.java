package com.classqs.webapplication.controllers;

import org.springframework.web.servlet.ModelAndView;

/**
 * Base class containing consistent functions for all controllers within the
 * application
 * 
 * @author Bash
 *
 */
public abstract class BaseController
{

	/**
	 * Put consistent content to view
	 * 
	 * @param mav
	 */
	protected void bindContentToView(ModelAndView mav)
	{
		// TODO: Add content from .properties file
	}
}
