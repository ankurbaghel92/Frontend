package com.niit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.yamahaonlinebackend.DAO.SupplierDAO;
import com.niit.yamahaonlinebackend.model.Supplier;

@Controller
public class SupplierController {

	@Autowired
	Supplier supplier;
	
	@Autowired
	SupplierDAO supplierDAO;
	
	
	
	@RequestMapping(value="/InsertSupplier")
	public String ShowInsertSupplier(Model model)
	{
		model.addAttribute("supplier", new Supplier());
	model.addAttribute("UserClickedInsertSupplier", "true");
	return "home";
		
	}
	
	
	@RequestMapping(value="/InsertSupplierform",method=RequestMethod.POST)
	public ModelAndView InsertSupplier(@ModelAttribute Supplier supplier)
	{
		ModelAndView mv = new ModelAndView("/home");
		/*supplier.setId(req.getParameter("SupId"));
		supplier.setName(req.getParameter("SupName"));
		supplier.setDescription(req.getParameter("SupAdd")) ;*/
		supplierDAO.save(supplier);
		mv.addObject("InsertSupplierSuccess", "Supplier has been SuccessFully Inserted");
		return mv;
	}
	
	
	@RequestMapping(value="/DisplayAllSupplier")
	public ModelAndView DisplayAllCategory(HttpSession session)
	{
		ModelAndView mv = new ModelAndView("home");
		/*session.setAttribute("supplier", supplier);
	session.setAttribute("supplierlist", supplierDAO.list());*/
	mv.addObject("supplier", supplier);
	mv.addObject("supplierlist", supplierDAO.list());

		mv.addObject("ShowingAllSupplier", "show");
		
		
		return mv;
	}
}
