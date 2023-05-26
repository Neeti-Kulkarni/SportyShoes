package com.example.demo.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.AdminDetails;
import com.example.demo.service.AdminDAO;

@Controller
public class AdminController {
	@Autowired
	AdminDAO dao;
	
	@RequestMapping("/insertadmin")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		AdminDetails e=new AdminDetails();
		e.setAd_username(request.getParameter("adusnm"));
		String user=e.getAd_username();
		e.setPassword(request.getParameter("adpass"));
		String pass=e.getPassword();
		String pass1=dao.adCheck(user);
		if(pass1!=null) {
			if(pass.equals(pass1)) {
				
				mv.setViewName("shoedetails.jsp");
			}
			else {
				String msg="Incorrect password..";
				mv.addObject("msg",msg);
				mv.setViewName("adminlogin1.jsp");
			}
			
		}
		else {
			String msg="Not a registered admin!!Try Again..";
			mv.addObject("msg",msg);
			mv.setViewName("adminlogin1.jsp");
		}
		return mv;
	}
	
}