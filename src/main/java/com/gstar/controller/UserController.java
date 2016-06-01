package com.gstar.controller;

import org.acp.support.security.ws.UserWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserWebService userclient;
	
	
	@RequestMapping("/login")
	public String login() {
		String str = userclient.login("test", "123456", 1);
		return str;
	}
}
