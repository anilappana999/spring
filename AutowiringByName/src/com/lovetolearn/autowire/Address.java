package com.lovetolearn.autowire;

public class Address {

	public int dno;
	public String cityName;
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", cityName=" + cityName + "]";
	}
	
}
