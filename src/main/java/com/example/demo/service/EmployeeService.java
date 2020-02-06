package com.example.demo.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;


public interface EmployeeService {

	public List<Employee> getEmployees();

	public Employee getEmployee(int id);

	public void createEmployee(Employee employee);

	public void deleteEmployee(int id);

	void updateEmployee(Employee employee);

}