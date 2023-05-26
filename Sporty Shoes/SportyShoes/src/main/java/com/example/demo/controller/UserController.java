package com.example.demo.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Shoes;
import com.example.demo.model.UserDetails;
import com.example.demo.service.UserDAO;

@Controller
public class UserController {
	@Autowired
	UserDAO dao;
	
	@RequestMapping("/insertuser")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		UserDetails e=new UserDetails();
		e.setF_name(request.getParameter("fname"));
		e.setL_name(request.getParameter("lname"));
		e.setDOB(request.getParameter("dob"));
		e.setUsername(request.getParameter("uusnm"));
		e.setPassword(request.getParameter("upass"));

		UserDetails ep= dao.insert(e);
		if(ep!=null) {
			String s="SignUp/Login Successful!";
			mv.addObject("s",s);
	
		mv.setViewName("showshoeuser.jsp");
			}
		return mv;
	}
	
	@RequestMapping("/loginuser")
	public ModelAndView loginControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		UserDetails e=new UserDetails();
		e.setUsername(request.getParameter("uusnm"));
		String username=e.getUsername();
		e.setPassword(request.getParameter("upass"));
		String pass=e.getPassword();
		String pass1=dao.ifExists(username);
		
		
		if(pass1!=null) {
	
			if(pass.equals(pass1)) {
				String s="Sign Up/Login Successful!";
				mv.addObject("username",username);
				mv.addObject("s",s);
				mv.setViewName("showshoeuser.jsp");
			}
			else {
				String q="Incorrect Password!!";
				mv.setViewName("userlogin1.jsp");
				mv.addObject("msg",q);
			}
		}
		else {
			String q="Sign Up first!!";
			mv.setViewName("userlogin1.jsp");
			mv.addObject("msg",q);
		}
		return mv;
	}
	
	@RequestMapping("/displayalluser")
	public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<UserDetails> list=dao.getall();
	mv.setViewName("displayusertoadmin.jsp");
	mv.addObject("list",list);	
		return mv;
	}
	
	

}