package com.cog.Employee.service;

import java.util.List;
import java.util.Optional;

import com.cog.Employee.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Optional<Employee> getEmployeeById(Long id);

	public Employee createEmployee(Employee employee);

	public Employee updateEmployee(Long id, Employee employeeDetails);

	public void deleteEmployee(Long id);

}
