package com.fantezy.FantezyFrontendProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController 
{
	@RequestMapping("/AboutUs")
	public String showAboutUs()
	{
		return "AboutUs";
	}
	
	@RequestMapping("/login")
	public String showLoginPage()
	{
		return "Login";
	}
	@RequestMapping("/Register")
	public String showSignup()
	{
		return "Register";
	}
	
	
	
	@RequestMapping("/ContactUs")
	public String showContact()
	{
		return "ContactUs";
	}
	

}
