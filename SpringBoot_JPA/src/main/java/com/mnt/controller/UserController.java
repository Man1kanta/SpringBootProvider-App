package com.mnt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	
	
	@RequestMapping("/sampleOne")
	@ResponseBody
	public String sample()
	{
		return "this is the sample method in controller class";
	}

}
