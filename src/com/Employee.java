package com;

public class Employee {

	private int id;
	private String name;
	private  float salary;
	private String designation;
	
	public Employee(int id, String name, float salary, String designation) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		
		
		
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
