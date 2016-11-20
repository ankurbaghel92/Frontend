package com.niit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.yamahaonlinebackend.model.Login;

@Controller
public class LoginController {


	@RequestMapping(value = "/login", method = RequestMethod.GET) 
	public String login(Model model) { 
	    model.addAttribute("login", new Login()); 
		model.addAttribute("userclickedlogin","true");
	    return "home"; 
	}
	
	@RequestMapping(value="/loginform")
	public String checklogin(HttpServletRequest request,HttpServletResponse res, Model model,HttpSession session)
	{
	String name=request.getParameter("username");
	String pass=request.getParameter("password");
	
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
	
	
	}
	
	

