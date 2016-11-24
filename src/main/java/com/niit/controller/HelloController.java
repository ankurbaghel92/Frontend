package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.yamahaonlinebackend.DAO.CategoryDAO;
import com.niit.yamahaonlinebackend.model.Category;
import com.niit.yamahaonlinebackend.model.Product;

@Controller
public class HelloController {

	@Autowired
	Category category;

	@Autowired
	CategoryDAO categoryDAO;

	@Autowired
	Product product;

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

	@RequestMapping("/")
	public ModelAndView index(HttpSession session) {
		ModelAndView mv = new ModelAndView("/home");
		session.setAttribute("category", category);
		session.setAttribute("product", product);
		System.out.println(category.getProducts());
		session.setAttribute("categorylist", categoryDAO.list());
		mv.addObject("ShowCarousel", "true");
		System.out.println("Index method");

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

	/*
	 * @RequestMapping(value="/home") public String home(Model model){
	 * model.addAttribute("userclickedHome","true"); return "home"; }
	 */
	/*
	 * @RequestMapping(value="/checklogin") public String
	 * checklogin(HttpServletRequest request,HttpServletResponse res, Model
	 * model,HttpSession session) { String name=request.getParameter("uname");
	 * String pass=request.getParameter("pass");
	 * 
	 * if((name.equals("ankur")) && (pass.equals("ankur"))) {
	 * session.setAttribute("successmessage", "You are Successfully Logged in");
	 * 
	 * return "home"; } else { model.addAttribute("errormessage",
	 * "Invalid Credentials,., Please login again"); return "home"; } }
	 * 
	 */}
