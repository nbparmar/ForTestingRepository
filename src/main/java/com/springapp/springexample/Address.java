package com.springapp.springexample;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String streetName;
	private String pincode;

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
