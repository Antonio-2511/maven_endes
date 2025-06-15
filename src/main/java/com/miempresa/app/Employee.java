package com.miempresa.app;

public class Employee {
	
	private String name;
	private int years;
	
	public Employee(String name, int years) {
		super();
		this.name = name;
		this.years = years;
	}

	public String getName() {
		return name;
	}

	public int getYears() {
		return years;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void setYears(int years) {
		this.years = years;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", years=" + years + "]";
	}
	
	

}
