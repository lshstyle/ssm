package com.demo.dao;

import java.util.List;

import com.demo.model.User;

public interface UserDao {
	public List<User> findAll(User u);
}
