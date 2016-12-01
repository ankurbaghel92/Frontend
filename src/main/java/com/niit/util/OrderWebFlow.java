package com.niit.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.niit.yamahaonlinebackend.model.BillingAddress;
import com.niit.yamahaonlinebackend.model.PaymentMethod;
import com.niit.yamahaonlinebackend.model.ShippingAddress;
import com.niit.yamahaonlinebackend.model.UserOrder;

@Component
public class OrderWebFlow {
	
	@Autowired
	UserOrder userOrder;
	

	public UserOrder initFlow()
	{
		userOrder = new UserOrder();
		return userOrder;
	}
	
	public String addShippingAddress(UserOrder userOrder, ShippingAddress shippingAddress)
	{
		try{
			userOrder.setShippingAddress(shippingAddress);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "fail";
		}
		return "success";
	}
	
	public String addBillingAddress(UserOrder userOrder, BillingAddress billingAddress)
	{
		try{
			userOrder.setBillingAddress(billingAddress);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "fail";
		}
		return "success";
	}
	
	public String addPaymentMethod(UserOrder userOrder, PaymentMethod paymentMethod)
	{
		try{
			userOrder.setPaymentMethod(paymentMethod);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "fail";
		}
		return "success";
	}
	
	
	
	
}
