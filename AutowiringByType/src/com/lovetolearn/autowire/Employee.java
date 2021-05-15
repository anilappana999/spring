package com.lovetolearn.autowire;

public class Employee {

	private String name;
	private int id;
	private Address addr;
	
		public Address getAddress() {
		return addr;
	}

	public void setAddress(Address address) {
		this.addr = address;
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
		return "Employee [name=" + name + ", id=" + id + ", address=" + addr + "]";
	}

	
	
}
