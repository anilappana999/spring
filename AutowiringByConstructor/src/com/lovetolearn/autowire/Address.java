package com.lovetolearn.autowire;

public class Address {

	public int dno;
	public String cityName;

	@Override
	public String toString() {
		return "Address [dno=" + dno + ", cityName=" + cityName + "]";
	}
	public Address(int dno, String cityName) {
		super();
		this.dno = dno;
		this.cityName = cityName;
	}
	
}
