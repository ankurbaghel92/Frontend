package com.niit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.yamahaonlinebackend.DAO.CartDAO;
import com.niit.yamahaonlinebackend.DAO.ProductDAO;
import com.niit.yamahaonlinebackend.model.Cart;
import com.niit.yamahaonlinebackend.model.Product;

@Controller
public class CartController {
	
	@Autowired
	Cart cart;
	
	@Autowired
	CartDAO cartDAO;
	
	@Autowired
	Product product;
	
	@Autowired
	ProductDAO productDAO;
	
	
	
	
	@RequestMapping(value="/mycart")
	public ModelAndView DisplayAllCategory(HttpSession session)
	{
		ModelAndView mv = new ModelAndView("home");
	
		String userid= (String) session.getAttribute("email");
		//List<Cart> cart = cartDAO.list(userid);
	System.out.println(userid);	
	mv.addObject("cart", cart);
	mv.addObject("cartlist", cartDAO.list(userid));
	mv.addObject("TotalAmount", cartDAO.get_TotalAmount(userid));
		mv.addObject("ShowingAllCart", "show");
		return mv;
	
	}
	
	
	
	@RequestMapping(value="/AddToCart",method=RequestMethod.GET)
	public ModelAndView AddtoCart(@RequestParam("pid") String Id,HttpSession session)
	{
		System.out.println(Id);
		ModelAndView mv= new ModelAndView("home");
		Product product = productDAO.get(Id);
		String email = (String) session.getAttribute("email");
		cart.setUser_Id(email);
		cart.setStatus('N');
		cart.setQuantity(1);
		cart.setId(cartDAO.getMaxId());
		cart.setProduct_Name(product.getName());
		cartDAO.Save(cart);
		mv.addObject("CartAddedSuccessMessage", "true");
		return mv;
	}
	
	
	}