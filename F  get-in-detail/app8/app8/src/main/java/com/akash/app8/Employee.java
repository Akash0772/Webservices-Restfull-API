package com.akash.app8;

public class Employee {
	private Integer id;
	private String firstName;
	private String lastName;
	private String[] mailAccounts;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String[] getMailAccounts() {
		return mailAccounts;
	}
	public void setMailAccounts(String[] mailAccounts) {
		this.mailAccounts = mailAccounts;
	}
	
}
