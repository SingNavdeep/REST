package com.study.spring.rest.api.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.study.spring.rest.api.domain.User;
import com.study.spring.rest.api.domain.UserData;

/**
 * spring service stereotype implementing ApiService 
 * @author Navdeep
 *
 */
@Service
public class ApiServiceImpl implements ApiService
{
	private RestTemplate restTemplate;
	
	//rest template autowired.
	public ApiServiceImpl(RestTemplate restTemplate)
	{
		this.restTemplate = restTemplate;
	}
	
	@Override
	/**
	 * get a list of users limited by limit.
	 */
	public List<User> getUsers(int limit)
	{
		UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class);
		
		return userData.getData();
	}
	
}
