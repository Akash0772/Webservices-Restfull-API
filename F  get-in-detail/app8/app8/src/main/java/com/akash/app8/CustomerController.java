package com.akash.app8;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {
	@PostMapping	// http://localhost:9090/customer		==>	Post
	public Customer save(@RequestBody Customer customer) {
		System.out.println("id:" + customer.getCustomerId());
		System.out.println("first name:" + customer.getFirstName());
		System.out.println("last name:" + customer.getLastName());
		System.out.println("house no:" + customer.getCustomerAddress().getHouseNo());
		System.out.println("street name:" + customer.getCustomerAddress().getStreetName());
		return customer;
	}
	/*
	 * JSon format
	 * {
	  		"customerId": "c101",
			"firstName": "abc",
			"lastName": "xyz",
			"customerAddress": {
            			"houseNo": "123/M",
              			"streetName": "BTM"
            					}
		}
	 */
}
