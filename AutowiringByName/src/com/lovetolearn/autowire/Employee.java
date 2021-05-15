package com.lovetolearn.autowire;

public class Employee {

	private String name;
	private int id;
	private Address address;
	
		public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}

	
	
}
