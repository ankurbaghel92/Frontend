package com.niit.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.yamahaonlinebackend.DAO.CategoryDAO;
import com.niit.yamahaonlinebackend.DAO.SupplierDAO;
import com.niit.yamahaonlinebackend.model.Category;
import com.niit.yamahaonlinebackend.model.Product;
import com.niit.yamahaonlinebackend.model.Supplier;

@Controller
public class ProductController {
	
	@Autowired
	Category category;
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	Supplier supplier;
	
	@Autowired
	SupplierDAO supplierDAO;
	
	@Autowired
	Product product;
	
	
	@RequestMapping(value="/InsertProduct")
	public ModelAndView ShowInsertProduct()
	{
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("product", new Product());
		mv.addObject("category", category);
		mv.addObject("supplier", supplier);
		mv.addObject("categorylist", categoryDAO.list());
		mv.addObject("supplierlist", supplierDAO.list());
		mv.addObject("userclickedInsertProduct","true");
		return mv;
	}
	

}
