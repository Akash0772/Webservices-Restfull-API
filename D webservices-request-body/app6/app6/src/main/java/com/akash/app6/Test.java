package com.akash.app6;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class Test {
	
	@RequestMapping("/t1") //http://localhost:9090/test/t1
	public String test1() {
//		System.out.println("from test1");
		return "from test1";
	}
	
	@RequestMapping("/t2") //http://localhost:9090/test/t2
	public String test2() {
//		System.out.println("from test2");
		return "from test2";
	}
	
	@RequestMapping() //http://localhost:9090/t3
	public String test3() {
//		System.out.println("from test3");
		return "from test3";
	}
	
	@RequestMapping("/t4") //http://localhost:9090/test/t4
	public String test4() {
//		System.out.println("from test3");
		return "i am from test4";
	}
	
	@RequestMapping(path = "/t5", method = RequestMethod.POST) //http://localhost:9090/test/t5
	public Person test5(@RequestBody Person person) {
		System.out.println("from test5:" + person.getFirstName());
		System.out.println("from test5:" + person.getLastName());
		return person;
	}
	/*
	 * jSon format 
	 * {
			"firstName": "abc",
			"lastName": "xyz"
		}
	 */
}
