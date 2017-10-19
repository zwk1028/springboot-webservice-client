package com.gstar.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace="http://service.spring.demo/")
public interface HelloWorld {
	
	@WebMethod(operationName="sayHi")
	public String sayHello(String s);
}
