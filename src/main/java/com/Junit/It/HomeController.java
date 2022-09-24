package com.Junit.It;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/home")
	public String home()
	{
	return "Hello World";	
	}
	
	@RequestMapping("/")
	public String homes()
	{
	return "Bonjour devops";	
	}
	

}
