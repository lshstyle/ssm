package com.demo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.dao.UserDao;
import com.demo.model.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserDao dao;
	
	@RequestMapping(value = "/login")
	public ModelAndView login(User u, HttpSession session, ModelMap model) throws Exception{
		ModelAndView mav = new ModelAndView("/login");
		return mav;
	}
	
	@RequestMapping(value = "/findAll")
	public ModelAndView findAll(User u, HttpSession session, ModelMap model, int pageNum, int pageSize) throws Exception{
		ModelAndView mav = new ModelAndView("/user/list");
		PageHelper.startPage(pageNum, pageSize);
		try {
			List<User> list = dao.findAll(u);
			session.setAttribute("userList", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mav;
	}
}
