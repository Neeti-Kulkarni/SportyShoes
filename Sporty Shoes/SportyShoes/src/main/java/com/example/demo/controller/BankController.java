package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.BankDetails;
import com.example.demo.model.Shoes;
import com.example.demo.model.UserDetails;
import com.example.demo.service.BankDAO;
import com.example.demo.service.UserDAO;

@Controller
public class BankController {
	@Autowired
	BankDAO dao;
	UserDAO dao1;
	
	@RequestMapping("/proceedpay")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Shoes e=new Shoes();
		e.setSh_price(Long.parseLong(request.getParameter("shprice")));
		Long pr=e.getSh_price();
		
		BankDetails bd=new BankDetails();
		bd.setB_id(Integer.parseInt(request.getParameter("bid")));
		int bid=bd.getB_id();
		BankDetails bal=dao.findBalance(bid);
		long balance=bal.getBalance();
		
		
		
		if(pr<balance) {
			
			mv.setViewName("paysuccess.jsp");
		}
		else {
			mv.setViewName("payfail.jsp");
		}
		return mv;
	}
}