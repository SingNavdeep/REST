package com.study.spring.rest.api.services;

import java.util.List;

import com.study.spring.rest.api.domain.User;

public interface ApiService
{
	public List<User> getUsers(int limit);
}
