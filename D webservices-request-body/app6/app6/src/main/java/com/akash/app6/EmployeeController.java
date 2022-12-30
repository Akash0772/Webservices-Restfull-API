package com.akash.app6;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp")
public class EmployeeController {
	
	@RequestMapping(path = "save", method = RequestMethod.POST)
	public Employee saveEmp(@RequestBody Employee employee) {
		System.out.println("Id:" + employee.getId());
		System.out.println("First Name:" + employee.getFirstName());
		System.out.println("Last Name:" + employee.getLastName());
		System.out.println("Mail account:" + Arrays.toString(employee.getMailAccounts()));
		return employee;
	}
	/*
	 * jSon format 
	 * {
	 * 		"id": 101,
			"firstName": "abc",
			"lastName": "xyz",
			"mailAccounts": ["abc@xyz.com", "abc1@xyz.com", "abc2@xyz.com"]
		}
	 */
}
