package com.niit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.yamahaonlinebackend.DAO.UserDAO;
import com.niit.yamahaonlinebackend.model.Login;
import com.niit.yamahaonlinebackend.model.User;

@Controller
public class LoginController {
	final static Logger log = LoggerFactory.getLogger(LoginController.class);

	
	@Autowired
	User user;
	
	@Autowired
	UserDAO userDAO;


	@RequestMapping(value = "/login", method = RequestMethod.GET) 
	public String login(Model model,HttpSession session) { 
	    model.addAttribute("login", new Login()); 
	    session.setAttribute("user", new Login());
		model.addAttribute("userclickedlogin","true");
	    return "home"; 
	}
	
	@RequestMapping(value="/loginform" ,method=RequestMethod.POST )
	public ModelAndView checklogin(HttpServletRequest request,HttpServletResponse res,HttpSession session)
	{
		log.debug("Starting of the CheckLogin Method");
		ModelAndView mv = new ModelAndView("home");
	    mv.addObject("login", new Login()); 

	String name=request.getParameter("username");
	String pass=request.getParameter("password");
	user = userDAO.IsValidUser(name, pass);
	if(user!=null)
	{
		if(user.getRole().equals("User"))
		{
		String username =user.getFname();
		String email = user.getEmail();
		session.setAttribute("email", email);
		session.setAttribute("Username", username);
		mv.addObject("ShowCarousel", "True");
	session.setAttribute("UserLoginSuccessMessage", "Welcome");
		log.debug("Ending of the CheckLogin Method");

	return mv;
	}
		else
		{
			mv.addObject("IsAdmin", "true");
			boolean showadmin = true;
			session.setAttribute("ShowAdminForm", showadmin);
			mv.addObject("AdminSuccessMessage", "You are Logged in Admin");
			log.debug("Ending of the CheckLogin Method");

			return mv;
		}
}
	
	else
	{
		mv.addObject("UserLoginErrorMessage", "Invalid Credentials,., Please login again");
		log.debug("Ending of the CheckLogin Method");

	return mv;
	
	}
	
	/*if((name.equals("ankur")) && (pass.equals("ankur")))
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
*/	
	}
	}
	
	

