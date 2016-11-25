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
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(value="/InsertCategoryform")
	public ModelAndView ProcessInsertCategory(@ModelAttribute Category category)
	{
		ModelAndView mv = new ModelAndView("home");
		categoryDAO.save(category);
		mv.addObject("category", category);
		mv.addObject("categorylist", categoryDAO.list());
		mv.addObject("InsertCategorySuccess", "Category has been Successfully Inserted");
		return mv;
	}
	
	@RequestMapping(value="/DisplayAllCategory")
	public ModelAndView DisplayAllCategory(HttpSession session)
	{
		ModelAndView mv = new ModelAndView("home");
	mv.addObject("category", category);
	mv.addObject("categorylist", categoryDAO.list());
		mv.addObject("ShowingAllCategory", "show");
		return mv;
	}
	
	@RequestMapping(value="/ModifyCategory")
	public ModelAndView ShowModifyCategory(@RequestParam("cid") String CategoryId){
		ModelAndView mv = new ModelAndView("home");
		category =categoryDAO.get(CategoryId);
		mv.addObject("category", category);
		mv.addObject("categorylist", categoryDAO.list());
		mv.addObject("UserCLickedModifyCategory", "true");
		return mv;
	}
	
	@RequestMapping(value="/ModifyCategoryform")	
	public ModelAndView ProcessModifyCategory(@ModelAttribute Category category)
	{
		ModelAndView mv = new ModelAndView("home");
		categoryDAO.update(category);
		mv.addObject("category", category);
		mv.addObject("cateogorylist", categoryDAO.list());
		mv.addObject("ModifyCategorySuccess", "Thank you Category has been Modified !!");
		return mv;
	}
	
	@RequestMapping(value="/DeleteCategory")
	public ModelAndView ProcessDeleteCategory(@RequestParam("cid") String CategoryId)
	{
		ModelAndView mv = new ModelAndView("home");
		System.out.println(CategoryId);
		category = categoryDAO.get(CategoryId);
		categoryDAO.delete(category);
		mv.addObject("category", category);
		mv.addObject("categorylist", categoryDAO.list());
		mv.addObject("DeleteCategorySuccess", "Thank you Category has been Deleted !!");
		return mv;
	}
	
	
	
}
