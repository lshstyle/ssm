package com.demo.dao;

import com.demo.model.Customer;

public interface CustomerDao {
	public Customer selectCustomerByName(String name);
}
