package com.akash.app5;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("test1/{id}") //http://localhost:9090/test1/10
	public String test1(@PathVariable Integer id) {
		System.out.println("from test1");
		return "id value:" + id;
	}
	
	@RequestMapping("test2/{firstName}") //http://localhost:9090/test2/hello
	public String test2(@PathVariable String firstName) {
		System.out.println("from test2");
		return "id value: " + firstName;
	}
	
	@RequestMapping("test3/{firstName}/{age}") //http://localhost:9090/test3/hello/23
	public String test3(@PathVariable String firstName, @PathVariable Integer age) {
		System.out.println("from test3");
		return "id value: " + firstName + ":" + age;
	}
	
	@RequestMapping("test4/firstName/{firstName}/age/{age}") //http://localhost:9090/test4/firstName/hello/age/23
	public String test4(@PathVariable String firstName, @PathVariable Integer age) {
		System.out.println("from test4");
		return "id value: " + firstName + ":" + age;
	}
	
	@RequestMapping("test5/{num1}") //http://localhost:9090/test5/10
	public Integer test5(@PathVariable Integer num1) {
		System.out.println("from test5");
		int squareValue = num1 * num1;
		return squareValue;
	}
	
	@RequestMapping("test6/num1/{num1}") //http://localhost:9090/test6/num1/5
	public Integer test6(@PathVariable Integer num1) {
		System.out.println("from test6");
		int squareValue = num1 * num1;
		return squareValue;
	}
	
	@RequestMapping("test7/{num1}/{num2}") //http://localhost:9090/test7/10/5
	public Integer test7(@PathVariable Integer num1, @PathVariable Integer num2) {
		System.out.println("from test7");
		int sumValue = num1 + num2;
		return sumValue;
	}
	
	@RequestMapping("test8/num1/{num1}/num2/{num2}") //http://localhost:9090/test7/num1/10/num2/5
	public Integer test8(@PathVariable Integer num1, @PathVariable Integer num2) {
		System.out.println("from test8");
		int sumValue = num1 + num2;
		return sumValue;
	}
	
	@RequestMapping("test9/{param1}") //http://localhost:9090/test9/16
	public Double test9(@PathVariable("param1") Integer num1) {
		System.out.println("from test9"); 
		double squareRoot = Math.sqrt(num1);
		return squareRoot;
	}
	
	@RequestMapping("test10/{hello1}") //http://localhost:9090/test10/akash
	public String test10(@PathVariable("hello1") String firstName) {
		System.out.println("from test10"); 
		return "first name:" + firstName;
	}
}
