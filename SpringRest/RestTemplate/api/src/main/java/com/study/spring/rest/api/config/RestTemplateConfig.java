package com.study.spring.rest.api.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

/**
 * spring configuration class to instantiate beans required by the app
 * @author Navdeep
 *
 */
@Configuration
public class RestTemplateConfig
{
	@Bean
	@Scope("singleton")
	public RestTemplate restTemplate(RestTemplateBuilder builder)
	{
		return builder.build();
	}
}
