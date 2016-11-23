package com.niit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.yamahaonlinebackend.model.User;

@Controller
public class UserController {
	

	@RequestMapping(value = "/user-register", method = RequestMethod.GET) 
	public String Register(Model model) { 
	    model.addAttribute("user", new User()); 
		model.addAttribute("userclickedRegister","true");
	    return "home"; 
	}

	@RequestMapping(value="/userform")
	public String checklogin(HttpServletRequest request,HttpServletResponse res, Model model,HttpSession session)
	{
		return null;
	}
}

