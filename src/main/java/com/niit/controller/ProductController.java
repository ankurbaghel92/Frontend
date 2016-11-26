package com.niit.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.yamahaonlinebackend.DAO.CategoryDAO;
import com.niit.yamahaonlinebackend.DAO.ProductDAO;
import com.niit.yamahaonlinebackend.DAO.SupplierDAO;
import com.niit.yamahaonlinebackend.model.Category;
import com.niit.yamahaonlinebackend.model.Product;
import com.niit.yamahaonlinebackend.model.Supplier;
import com.niit.yamahaonlinebackend.util.FileUtil;

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
	
	@Autowired
	ProductDAO productDAO;
	
	
	@RequestMapping(value="/InsertProduct",method=RequestMethod.GET)
	public ModelAndView ShowInsertProduct()
	{
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("product", new Product());
		mv.addObject("category", category);
		mv.addObject("categorylist", categoryDAO.list());
		mv.addObject("supplier", supplier);
		mv.addObject("supplierlist", supplierDAO.list());
		mv.addObject("product", product);
		mv.addObject("productlist", productDAO.list());
		mv.addObject("userclickedInsertProduct","true");
		return mv;
	} 
	
	@RequestMapping(value="/ProcessInsertProductform",method=RequestMethod.POST)
	public ModelAndView ProcessInsertProductform(@ModelAttribute Product product,MultipartFile file)
	{
		ModelAndView mv = new ModelAndView("home");
		System.out.println(product.getName());
		file=product.getImage();
		
		FileUtil.Upload("D:\\DT NIIT\\yamahaonline\\ProductImages", file, product.getId()+".jpg");
		productDAO.save(product);
		mv.addObject("product", product);
		mv.addObject("productlist", productDAO.list());
		mv.addObject("InsertProductSuccess", "Thank you Product Has Been Inserted !!");
		return mv;
	}
	
	@RequestMapping(value="/DisplayAllProduct")
	public ModelAndView DisplayAllProduct()
	{
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("product", product);
		mv.addObject("productlist", productDAO.list());
		mv.addObject("ShowAllProduct", "true");
		return mv;
		
	}
	
	
	
	@RequestMapping(value="/ModifyProduct")
	public ModelAndView ShowModifyProduct(@RequestParam("pid")String ProductId)
	{
		ModelAndView mv = new ModelAndView("home");
		product=productDAO.get(ProductId);
		mv.addObject("product", product);
		mv.addObject("productlist", productDAO.list());
		mv.addObject("category", category);
		mv.addObject("categorylist", categoryDAO.list());
		mv.addObject("supplier", supplier);
		mv.addObject("supplierlist", supplierDAO.list());
	mv.addObject("AdminClickedModifyProduct", "true");		
		return mv;
	}
	
	
	
	@RequestMapping(value="/ModifyProductform")	
	public ModelAndView ModifyProduct(@ModelAttribute Product product)
	{
		ModelAndView mv = new ModelAndView("home");
		productDAO.update(product);
		mv.addObject("product", product);
		mv.addObject("productlist", productDAO.list());
		mv.addObject("category", category);
		mv.addObject("categorylist", categoryDAO.list());
		mv.addObject("supplier", supplier);
		mv.addObject("supplierlist", supplierDAO.list());
		mv.addObject("ModifyProductSuccess", "Thank you Product has been Modified !!");	
		return mv;
	}
	
	
	@RequestMapping(value="/DeleteProduct")
	public ModelAndView DeleteProduct(@RequestParam("pid")String ProductId)
	{
		ModelAndView mv = new ModelAndView("home");
		product=productDAO.get(ProductId);
		productDAO.delete(product);
		mv.addObject("product", product);
		mv.addObject("productlist", productDAO.list());
		mv.addObject("category", category);
		mv.addObject("categorylist", categoryDAO.list());
		mv.addObject("supplier", supplier);
		mv.addObject("supplierlist", supplierDAO.list());
		mv.addObject("DeleteProductSuccess", "Thank you Product has been Deleted !!");	
		
		return mv;
	}
	
	
	

}
