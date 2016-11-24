package com.niit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.yamahaonlinebackend.DAO.CategoryDAO;
import com.niit.yamahaonlinebackend.model.Category;
import com.niit.yamahaonlinebackend.model.Product;

@Controller
public class CategoryController {
	
	@Autowired
	Category category;
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	Product product;
	
	
	
	@RequestMapping(value="/InsertCategory",method=RequestMethod.GET)
	public String ShowInsertCategory(Model model){
		model.addAttribute("userclickedInsertCategory","true");
		model.addAttribute("category", new Category());
				return "home";
	}
	
/*	@RequestMapping(value="/demo")
	public ModelAndView demo(HttpSession session){
		ModelAndView mv = new ModelAndView("/DemoCategory");
		session.setAttribute("category", category);
		session.setAttribute("product", product);
		System.out.println(category.getProducts());

		session.setAttribute("categorylist", categoryDAO.list());
		return mv;
		
	}
		
	*/
	
	
	@RequestMapping(value="/InsertCategoryform")
	public ModelAndView ProcessInsertCategory(@ModelAttribute Category category)
	{
		ModelAndView model = new ModelAndView("home");
		/*String CatId=req.getParameter("CatId");
		String CatName=req.getParameter("CatName");
		String CatDesc=req.getParameter("CatDesc");
		category.setId(CatId);
		category.setName(CatName);
		category.setDescription(CatDesc);*/
		categoryDAO.save(category);
		
		/*System.out.println(CatId);
		System.out.println(CatName);
		System.out.println(CatDesc);*/
		model.addObject("InsertCategorySuccess", "Category has been Successfully Inserted");
		return model;
	}
	
	
	@RequestMapping(value="/DisplayAllCategory")
	public ModelAndView DisplayAllCategory(HttpSession session)
	{
		ModelAndView mv = new ModelAndView("home");
		/*session.setAttribute("category", category);
	session.setAttribute("categorylist", categoryDAO.list());*/
	mv.addObject("category", category);
	mv.addObject("categorylist", categoryDAO.list());

		mv.addObject("ShowingAllCategory", "show");
		
		
		return mv;
	}
}
