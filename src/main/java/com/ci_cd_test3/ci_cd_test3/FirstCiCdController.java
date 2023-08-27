package com.ci_cd_test3.ci_cd_test3;

	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;
	 
	@RestController
	public class FirstCiCdController {
	 
	    @RequestMapping("/hello")
	    public String hello() {
	        return "Hello World RESTful with Spring Boot";
	    }  
	}
