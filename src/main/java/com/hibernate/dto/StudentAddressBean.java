package com.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;

public class StudentAddressBean implements Serializable {
	@EmbeddedId
	private AddressPkBean addrespk;
	@Column(name = "add1")

	private String add1;
	@Column(name = "add2")
	private String add2;
	@Column(name = "city")
	private String city;
	@Column(name = "pincode")
	private int pincode;

	public AddressPkBean getAddrespk() {
		return addrespk;
	}

	public void setAddrespk(AddressPkBean addrespk) {
		this.addrespk = addrespk;
	}

	public String getAdd1() {
		return add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

}
