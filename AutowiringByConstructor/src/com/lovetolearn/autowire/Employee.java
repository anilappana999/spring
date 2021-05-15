package com.lovetolearn.autowire;

public class Employee {

	private String name;
	private int id;
	private Address address;
	
		public Address getAddress() {
		return address;
	}

	public Employee(String name, int id, Address address) {
			super();
			this.name = name;
			this.id = id;
			this.address = address;
		}

	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}

	
	
}
