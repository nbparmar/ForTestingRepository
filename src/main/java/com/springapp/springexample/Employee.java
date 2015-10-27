package com.springapp.springexample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String name;
	private String email;

	@Inject
	private Address address;

	public String getName() {
		return name;
	}

	// @Required annotation will check at deployment time that this property exists or not
	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	@Required
	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	//Spring container will check for "address" bean in the xml file
	@Resource(name = "address")
	public void setAddress(Address address) {
		this.address = address;
	}

	@PostConstruct
	public void initBean() {
		System.out.println("Initializing Bean...");
	}

	@PreDestroy
	public void destroyBean() {
		System.out.println("Destroying Bean...");
	}

	public void draw() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("House No.: " + address.getHouseNo());
		System.out.println("Street Name: " + address.getStreetName());
		System.out.println("Pincode: " + address.getPincode());
	}
}
