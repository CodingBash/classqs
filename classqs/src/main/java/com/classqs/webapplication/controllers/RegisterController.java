package com.classqs.webapplication.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.classqs.webapplication.constants.ClassQsConstants;
import com.classqs.webapplication.models.RegisterInformation;

@Controller
@RequestMapping(value = "/register")
public class RegisterController extends BaseController
{
	public ModelAndView register(@Valid RegisterInformation register)
	{
		ModelAndView mav = new ModelAndView();
		bindContentToView(mav);
		mav.setViewName(ClassQsConstants.REDIRECT + "/dashboard");
		return mav;
	}
}
