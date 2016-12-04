package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.yamahaonlinebackend.DAO.CategoryDAO;
import com.niit.yamahaonlinebackend.DAO.ProductDAO;
import com.niit.yamahaonlinebackend.model.Category;
import com.niit.yamahaonlinebackend.model.Product;



@Controller
public class HelloController {
	public static Logger log = LoggerFactory.getLogger(HelloController.class.getName());


	@Autowired
	Category category;

	@Autowired
	CategoryDAO categoryDAO;

	@Autowired
	Product product;

	@Autowired
	ProductDAO productDAO;


	
	
	
	

	@RequestMapping(value = "/contact-us")
	public String contactus(Model model) {
		log.debug("HelloController ---> Starting of the Method Contactus()");
		model.addAttribute("userclickedcontact", "true");
		log.debug("HelloController --->Ending of the Method Contactus()");
		return "home";
	}
	/*
	 * @RequestMapping(value="/user-register") public String Register(Model
	 * model){ model.addAttribute("userclickedRegister","true"); return "home";
	 * }
	 */
	
	@RequestMapping({"/","/home"})
	public ModelAndView index(HttpSession session) {
		log.debug("HelloController ---> Starting of the Method Index()");
		ModelAndView mv = new ModelAndView("/home");
		session.setAttribute("category", category);
		session.setAttribute("product", product);
		System.out.println(category.getProducts());
		session.setAttribute("categorylist", categoryDAO.list());
		mv.addObject("ShowCarousel", "true");
		System.out.println("Index method");
		log.debug("HelloController --->Ending of the Method Index()");
		return mv;
	}

	
	@RequestMapping(value = "/about-us")
	public String aboutus(Model model) {
		log.debug("HelloController ---> Starting of the Method Aboutus()");
		model.addAttribute("userclickedAbout", "true");
		log.debug("HelloController --->Ending of the Method Aboutus()");
		return "home";
	}
/*
	@RequestMapping(value = "/demo")
	public String demo(Model model) {
		model.addAttribute("userclickedDemo", "true");
		return "home";
	}*/
	
	@RequestMapping(value="/accessdenied")
	public String accessDenied(Model model)
	{
		log.debug("HelloController ---> Starting of the Method accessDenied()");
		model.addAttribute("AccessDenied", "You Are not Authorized to Access this Page");
		model.addAttribute("accessdenied", "true");
		log.debug("HelloController ---> Ending of the Method accessDenied()");
		return "home";
	}
	
	
	
	
	}
