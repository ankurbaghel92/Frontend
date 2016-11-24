package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.yamahaonlinebackend.DAO.UserDAO;
import com.niit.yamahaonlinebackend.model.Login;
import com.niit.yamahaonlinebackend.model.User;

@Controller
public class UserController {
	
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	User user;
	
	@Autowired
	Login login;
	

	@RequestMapping(value = "/user-register", method = RequestMethod.GET) 
	public String Register(Model model,HttpSession session) { 
	    model.addAttribute("user", new User()); 
		model.addAttribute("userclickedRegister","true");
	    return "home"; 
	}

	@RequestMapping(value="/userform",method=RequestMethod.POST)
	public ModelAndView checklogin(@ModelAttribute User user,HttpSession session)
	{
		ModelAndView mv = new ModelAndView("home");
		 mv.addObject("login", new Login()); 
		if(userDAO.get(user.getEmail())==null)
		{
			user.setRole("User");
			userDAO.save(user);
			mv.addObject("UserRegisterSuccess", "true");
			mv.addObject("UserRegisterSuccessMessage", "Thank you! Please Login to Avail More Service !!");
			return mv;
		}
		else
		{
			mv.addObject("UserRegisterError", "true");
			mv.addObject("UserRegisterErrorMessage", "Your Email Id Already Exist in our Database!! Please Try with Different Email ID");
			return mv;
		}
	}
}

