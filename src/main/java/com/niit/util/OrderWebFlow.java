package com.niit.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.niit.controller.LoginController;
import com.niit.yamahaonlinebackend.model.BillingAddress;
import com.niit.yamahaonlinebackend.model.PaymentMethod;
import com.niit.yamahaonlinebackend.model.ShippingAddress;
import com.niit.yamahaonlinebackend.model.UserOrder;

@Component
public class OrderWebFlow {
	final static Logger log = LoggerFactory.getLogger(OrderWebFlow.class);

	
	@Autowired
	UserOrder userOrder;
	
	@Autowired
	ShippingAddress shippingAddress;
	
	@Autowired
	BillingAddress billingAddress;
	

	public UserOrder initFlow()
	
	{
		log.debug("WEBFLOW-->  Stating the Method initFlow()");
		userOrder = new UserOrder();
		log.debug("WEBFLOW-->  Ending the Method initFlow()");
		return userOrder;
	}
	
	public String addShippingAddress(UserOrder userOrder, ShippingAddress shippingAddress)
	{
		log.debug("WEBFLOW-->  Stating the Method addShippingAddress()");

		try{
			userOrder.setShippingAddress(shippingAddress);
		}
		catch(Exception e)
		{
			log.debug("WEBFLOW-->  Ending the Method addShippingAddress()");

			e.printStackTrace();
			return "fail";
		}
		log.debug("WEBFLOW-->  Ending the Method addShippingAddress()");

		return "success";
	}
	
	public String addBillingAddress(UserOrder userOrder, BillingAddress billingAddress)
	{
		log.debug("WEBFLOW-->  Stating the Method addBillingAddress()");

		try{
			userOrder.setBillingAddress(billingAddress);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			log.debug("WEBFLOW-->  Ending the Method addBillingAddress()");

			return "fail";
		}
		log.debug("WEBFLOW-->  Ending the Method addBillingAddress()");

		return "success";
	}
	
	public String addPaymentMethod(UserOrder userOrder, PaymentMethod paymentMethod)
	{
		log.debug("WEBFLOW-->  Stating the Method addPaymentMethod()");
		try{
			userOrder.setPaymentMethod(paymentMethod);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			log.debug("WEBFLOW-->  Ending the Method addPaymentMethod()");

			return "fail";
		}
		log.debug("WEBFLOW-->  Ending the Method addPaymentMethod()");

		return "success";
	}
	
	
	
	
}
