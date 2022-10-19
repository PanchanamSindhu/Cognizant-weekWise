package com.cog.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.cog.model.Employee;

public class EmployeeService {

	/*
	 * mapToDouble() method returns a DoubleStream consisting of the results of
	 * applying the given function to the elements of this stream
	 **/

	public static double calculateAverage(List<Employee> employeeList) {
		return employeeList.stream().mapToDouble(e -> e.getSalary()).average().getAsDouble();
	}

	public static List<Employee> empRole(List<Employee> employeeList) {
		List<Employee> result = employeeList.stream().filter(p -> p.getRole().equalsIgnoreCase("SE"))
				.collect(Collectors.toList());

		return result;
	}

	public static Map<Integer, String> displayEmp(List<Employee> empList) {
		Map<Integer, String> emp = new HashMap<Integer, String>();
		emp = empList.stream().collect(Collectors.toMap(Employee::getEmpID, Employee::getName));
		return emp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<Employee>();
		Employee e1 = new Employee("John", 23, 14000, "SE", 101);
		Employee e2 = new Employee("Bob", 24, 25000, "analyst", 102);
		Employee e3 = new Employee("Tom", 25, 26000, "SE", 103);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);

		System.out.println("Employes average salary is :" + EmployeeService.calculateAverage(empList));
		System.out.println("Employes Who's Role is SE :" + EmployeeService.empRole(empList));
		System.out.println("Displaying Employees names with ID numbers :" + EmployeeService.displayEmp(empList));
	}

}
