package com.akash.app6;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("test1")
	public String test1() {
		return "i am from test1";
	}
	
	@RequestMapping(path = "test2")
	public String test2() {
		return "i am from test2";
	}
	
	@RequestMapping(path = "test3", method = RequestMethod.GET)
	public String test3() {
		return "i am from test3";
	}
	
	@GetMapping(path = "test4")
	public String test4() {
		return "i am from test4";
	}
	
	@GetMapping("test5")
	public String test5() {
		return "i am from test5";
	}
	
	@GetMapping("/test6")
	public String test6() {
		return "i am from test6";
	}
	
	@RequestMapping("/test7")
	public String test7() {
		return "i am from test7";
	}
	
	@RequestMapping(path = "/test8", method = RequestMethod.GET)
	public String test8() {
		return "i am from test8";
	}
	
	@RequestMapping(path = "/test9/task1", method = RequestMethod.GET)
	public String test9() {
		return "i am from test9";
	}
}
