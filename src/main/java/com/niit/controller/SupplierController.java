package com.niit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.yamahaonlinebackend.DAO.SupplierDAO;
import com.niit.yamahaonlinebackend.model.Supplier;

@Controller
public class SupplierController {

	@Autowired
	Supplier supplier;
	
	@Autowired
	SupplierDAO supplierDAO;
	
	
	
	@RequestMapping(value="/InsertSupplierForm")
	public String ShowInsertSupplier(Model model)
	{
	model.addAttribute("UserClickedInsertSupplier", "true");
	return "home";
		
	}
	
	@RequestMapping(value="/InsertSupplier")
	public ModelAndView InsertSupplier(HttpServletRequest req, HttpServletResponse res)
	{
		ModelAndView mv = new ModelAndView("/home");
		supplier.setId(req.getParameter("SupId"));
		supplier.setName(req.getParameter("SupName"));
		supplier.setDescription(req.getParameter("SupAdd")) ;
		supplierDAO.save(supplier);
		mv.addObject("InsertSupplierSuccess", "Supplier has been SuccessFully Inserted");
		return mv;
	}
	
}
