package com.example.demo.empaddressmodel;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "address")

public class EmpAddressModel {
	private String id;
	private String city;
	private String state;
	private String country;

	public EmpAddressModel(String id, String city, String state, String country) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "EmpAddressModel [id=" + id + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}
