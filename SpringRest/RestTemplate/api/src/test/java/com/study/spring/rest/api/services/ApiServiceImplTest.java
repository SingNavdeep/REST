package com.study.spring.rest.api.services;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.study.spring.rest.api.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest extends TestCase
{
	@Autowired
	private ApiService apiSer;
	
	@Test
	public void testGetUsers()
	{
		List<User> users = apiSer.getUsers(3);
		
		assertEquals(4, users.size());
	}
}
