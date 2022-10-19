package com.cog.model;

public class Employee {

	private String name;
	private int age;
	private double salary;
	private String role;
	private int empID;

	public Employee(String name, int age, double salary, String role, int empID) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.role = role;
		this.empID = empID;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", role=" + role + ", empID=" + empID
				+ "]";
	}

}
