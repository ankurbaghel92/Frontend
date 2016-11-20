package com.niit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value="/contact-us")
	public String contactus(Model model){
		model.addAttribute("userclickedcontact","true");
		return "home";
	}
	
	@RequestMapping(value="/user-register")
	public String Register(Model model){
		model.addAttribute("userclickedRegister","true");
		return "home";
	}
	
	@RequestMapping(value="/")
	public String index(){
		return "index";
	}
	
	/*
	@RequestMapping(value="/login")
	public String login(Model model){
		model.addAttribute("userclickedlogin","true");
				return "home";
	}*/
	
	@RequestMapping(value="/about-us")
	public String aboutus(Model model){
		model.addAttribute("userclickedAbout","true");
				return "home";
	}
	
	@RequestMapping(value="/home")
	public String home(Model model){
		model.addAttribute("userclickedHome","true");
				return "home";
	}
	/*
	@RequestMapping(value="/checklogin")
	public String checklogin(HttpServletRequest request,HttpServletResponse res, Model model,HttpSession session)
	{
	String name=request.getParameter("uname");
	String pass=request.getParameter("pass");
	
	if((name.equals("ankur")) && (pass.equals("ankur")))
	{
		session.setAttribute("successmessage", "You are Successfully Logged in");

		return "home";
	}
		else
		{
			model.addAttribute("errormessage", "Invalid Credentials,., Please login again");
			return "home";
		}
		}
	
*/}

