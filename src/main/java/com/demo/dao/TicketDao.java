package com.demo.dao;

import com.demo.model.Ticket;

public interface TicketDao {
	public Ticket selectTicketByName(int id);
}
