package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.Shoes;
import com.example.demo.service.ShoeDAO;

@Controller
public class ShoesController {
	@Autowired
	ShoeDAO dao;
	
	@RequestMapping("/insertshoe")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Shoes e=new Shoes();
		e.setSh_id(Integer.parseInt(request.getParameter("shid")));
		e.setSh_name(request.getParameter("shname"));
		e.setSh_price(Long.parseLong(request.getParameter("shprice")));
		
		Shoes ep=dao.insert(e);
		if(ep!=null) {
			mv.setViewName("success.jsp");
		}
	
		return mv;
	}
	@RequestMapping("/showshoesadmin")
	public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<Shoes> list=dao.getall();
	mv.setViewName("displayshadmin.jsp");
	mv.addObject("list",list);	
		return mv;
	}
	
	
	

	@RequestMapping("/deleteshoe")
	public ModelAndView dlt(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Shoes s=new Shoes();
		s.setSh_id(Integer.parseInt(request.getParameter("shid")));
		String ss=dao.delete(s);
		if(ss!=null) {
			mv.setViewName("success.jsp");
		}
		return mv;
	}
	
	
	@RequestMapping("/displayshoeuser")
	public ModelAndView dispUser(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	List<Shoes> list=dao.getall();
	
	mv.setViewName("displayuser.jsp");

	mv.addObject("list",list);	
		return mv;
	}

	@RequestMapping("/editshoe")
	public ModelAndView edt(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		Shoes s=new Shoes();
		s.setSh_id(Integer.parseInt(request.getParameter("shid")));
		s.setSh_name(request.getParameter("shname"));
		s.setSh_price(Long.parseLong(request.getParameter("shprice")));
		Shoes ss=dao.updateByName(s);
		if(ss!=null) {
			mv.setViewName("success.jsp");
		}
		return mv;
		}
}