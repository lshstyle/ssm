package com.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.dao.CustomerDao;
import com.demo.model.Customer;
import com.github.pagehelper.PageHelper;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Resource
	private CustomerDao dao;
	
	@RequestMapping(value = "/name")
	public ModelAndView selectCustomerByName(@RequestParam("name")String name, HttpSession session, ModelMap model) throws Exception{
		//PageHelper.startPage(pageNo, pageSize);
		ModelAndView mav = new ModelAndView("/customer/list");
		try {
			Customer customer = dao.selectCustomerByName(name);
			session.setAttribute("customerInfo", customer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mav;
	}
	
}
