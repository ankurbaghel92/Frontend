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
		model.addAttribute("userclickedcontact", "true");
		return "home";
	}
	/*
	 * @RequestMapping(value="/user-register") public String Register(Model
	 * model){ model.addAttribute("userclickedRegister","true"); return "home";
	 * }
	 */
	
	@RequestMapping({"/","/home"})
	public ModelAndView index(HttpSession session) {
		log.debug("Starting of the Method Index");
		ModelAndView mv = new ModelAndView("/home");
		session.setAttribute("category", category);
		session.setAttribute("product", product);
		System.out.println(category.getProducts());
		session.setAttribute("categorylist", categoryDAO.list());
		mv.addObject("ShowCarousel", "true");
		System.out.println("Index method");
		log.debug("Ending of the Method Index");
		return mv;
	}

	/*
	 * @RequestMapping(value="/login") public String login(Model model){
	 * model.addAttribute("userclickedlogin","true"); return "home"; }
	 */

	/*
	 * @RequestMapping(value="/InsertSupplier") public String
	 * InsertSupplier(Model model){
	 * model.addAttribute("userclickedInsertSupplier","true"); return "home"; }
	 */
	@RequestMapping(value = "/about-us")
	public String aboutus(Model model) {
		model.addAttribute("userclickedAbout", "true");
		return "home";
	}

	@RequestMapping(value = "/demo")
	public String demo(Model model) {
		model.addAttribute("userclickedDemo", "true");
		return "home";
	}
	
	
	}
