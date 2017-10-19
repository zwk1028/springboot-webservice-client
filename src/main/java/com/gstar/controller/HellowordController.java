package com.gstar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gstar.service.HelloWorld;

@RestController
public class HellowordController {
	
	@Autowired
	private ApplicationContext context;
	
	@RequestMapping("/hi")
	public String sayHi() {
		System.out.println("---------start-----------");
		HelloWorld h = context.getBean("iHelloWorld",HelloWorld.class);
		String s = h.sayHello("helsdkfjkls");
		return s;
	}
	
}
