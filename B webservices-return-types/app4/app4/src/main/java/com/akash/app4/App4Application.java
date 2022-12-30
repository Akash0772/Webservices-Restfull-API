package com.akash.app4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App4Application {

	public static void main(String[] args) {
		SpringApplication.run(App4Application.class, args);
	}
	
	@RequestMapping("t1") //http://localhost:9090/t1
	public String test1() {
		System.out.println("from test1");
		return "hello from rest API";
	}
	
	@RequestMapping("t2") //http://localhost:9090/t2
	public int test2() {
		System.out.println("from test2");
		return 600;
	}
	
	@RequestMapping("t3") //http://localhost:9090/t3
	public boolean test3() {
		System.out.println("from test3");
		return true;
	}
	
	@RequestMapping("t4") //http://localhost:9090/t4
	public int[] test4(){
		System.out.println("from test4");
		int[] elements = {10, 20, 30, 40};
		return elements;
	}
	
	@RequestMapping("t5") //http://localhost:9090/t5
	public String[] test5() {
		System.out.println("from test5");
		String[] elements = {"abc", "xyz", "test", "hello"};
		return elements;
	}
	
	@RequestMapping("t6") //http://localhost:9090/t6
	public ArrayList<String> test6(){
		System.out.println("from test6");
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("hello");
		list.add("test");
		return list;
	}
	
	@RequestMapping("t7") //http://localhost:9090/t7
	public HashSet<Integer> test7(){
		System.out.println("from test7");
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(90);
		set.add(900);
		set.add(789);
		set.add(100);
		set.add(9);
		return set;
	}
	
	@RequestMapping("t8") //http://localhost:9090/t8
	public HashMap<String, String> test8(){
		System.out.println("from test8");
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("firstName", "Akash");
		map.put("lastName", "Chaurasiya");
		map.put("Address", "Bangalore BTM");
		return map;
	}
	
	@RequestMapping("p1") //http://localhost:9090/p1
	public Person getPerson() {
		Person person = new Person();
		person.setFirstName("Akash");
		person.setLastName("Chaurasiya");
		return person;
	}
	
	@RequestMapping("a1") //http://localhost:9090/a1
	public Address getAddress() {
		Address add = new Address();
		add.setHouseNo("123/M");
		add.setStreetName("Bangalore");
		return add;
	}
	
	@RequestMapping("emp") //http://localhost:9090/emp
	public Employee getEmployee() {
		Employee emp = new Employee();
		emp.setFirstName("abc");
		emp.setLastName("xyz");
		emp.setAge(22);
		Address address = new Address();
		address.setHouseNo("234/u");
		address.setStreetName("BTM");
		emp.setAddress(address);
		return emp;
	}			
}

