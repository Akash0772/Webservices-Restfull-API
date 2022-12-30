package com.akash.app8;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {
	
	@RequestMapping("/t1")
	public String test1() {
		return "from test1";
	}
	
	@RequestMapping("/t2")  // http://localhost:9090/test/t2
	public String test2() {
		return "from test2";
	}
	
	@RequestMapping()  // http://localhost:9090/test
	public String test3() {
		return "from test3";
	}
	
	@RequestMapping("/t4") // http://localhost:9090/test/t4
	public String test4() {
		return "i am from test4";
	}

	@RequestMapping(path = "t5", method = RequestMethod.POST)
	public Person hello5(@RequestBody Person person) {
		System.out.println("from test5 firstName:" + person.getFirstName());
		System.out.println("from test5 lastName:" + person.getLastName());
		return person;
	}
}
