package com.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.dao.TicketDao;
import com.demo.model.Ticket;

@Controller
@RequestMapping("/ticket")
public class TicketController {
	
	@Resource
	private TicketDao dao;
	
	@RequestMapping(value = "/name")
	public ModelAndView selectTicketByName(@RequestParam("id")int id, HttpSession session, ModelMap model) throws Exception{
		ModelAndView mav = new ModelAndView("/ticket/list");
		try {
			Ticket ticket = dao.selectTicketByName(id);
			session.setAttribute("ticketInfo", ticket);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mav;
	}
}
