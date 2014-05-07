package org.springside.examples.showcase.webservice.soap;

import javax.jws.WebService;

@WebService
public class UserSoapServiceImpl {
	public String testStr(String str){
		return "hello " + str;
	}
}
