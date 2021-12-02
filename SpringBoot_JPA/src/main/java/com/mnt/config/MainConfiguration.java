package com.mnt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class MainConfiguration 
{
	
	@Bean
	public Docket getDocket()
	{
		
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors.basePackage("com.mnt.controller"))
				.build();
	}
	
	
	private ApiInfo getApiInfo()
	{
		return new ApiInfo("UserManagementProject",
				"user management app user for storing the user details", 
				"1.0", "www.mnt.com",
				new Contact("manikanta", null,"manikantamukkapati9@gmail.com"),
				null , null, null);
	}

}
