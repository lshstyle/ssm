package com.demo.model;

public class Ticket {
	private Integer ticketId;
	private String ticketAddress;
	private Double ticketPrice;
	private Integer ticketCid;
	private Customer customer;
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public String getTicketAddress() {
		return ticketAddress;
	}
	public void setTicketAddress(String ticketAddress) {
		this.ticketAddress = ticketAddress;
	}
	public Double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public Integer getTicketCid() {
		return ticketCid;
	}
	public void setTicketCid(Integer ticketCid) {
		this.ticketCid = ticketCid;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
