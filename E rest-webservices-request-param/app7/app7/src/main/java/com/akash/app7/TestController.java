package com.akash.app7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("test1") //http://localhost:9090/test1?param1=Hello
	public String test1(@RequestParam String param1) {
		System.out.println("from test1");
		return "value of param1:" + param1;
	}
	
	@RequestMapping("test2") //http://localhost:9090/test2?firstName=vijay&lastName=test
	public String test2(@RequestParam String firstName, @RequestParam String lastName) {
		System.out.println("from test2");
		String fullName = firstName + " " + lastName;
		return "fullName:" + fullName;
	}
	
	@RequestMapping("test3") //http://localhost:9090/test3?age=25
	public String test3(@RequestParam Integer age) {
		System.out.println("age value:" + age);
		return "Age is:" + age;
	}
	
	@RequestMapping("test4") //http://localhost:9090/test4?lastName=abc
	public String test4(@RequestParam(required = false) String lastName) {
		System.out.println("last Name:" + lastName);
		return "Last Name:" + lastName;
	}
	
	@RequestMapping("test5")	//http://localhost:9090/test5?lastName=abc
	public String test5(@RequestParam(required = true) String lastName) {
		System.out.println("last name:" + lastName);
		return "last name:" + lastName;
	}	
	
	@RequestMapping("test6")	//http://localhost:9090/test6?param1=abc
	public String test6(@RequestParam(name = "param1") String lastName) {
		System.out.println("last name:" + lastName);
		return "last name:" + lastName;
	}	

	@RequestMapping("test7")	//http://localhost:9090/test7?param1=abc
	public String test7(@RequestParam(value = "param1") String lastName) {
		System.out.println("last name:" + lastName);
		return "last name:" + lastName;
	}	

	@RequestMapping("test8")	//http://localhost:9090/test8?lastName=vijay
	public String test8(@RequestParam(defaultValue = "abc") String lastName) {
		System.out.println("last name:" + lastName);
		return "last name:" + lastName;
	}
}
