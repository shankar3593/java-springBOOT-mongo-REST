package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeservice;

	@RequestMapping(value = "/getdata", method = RequestMethod.GET)
	public Employee getEmployees(@RequestParam int id) {
		System.out.println("fetching getAPI.......");
		return employeeservice.getEmployee(id);
	}

	@RequestMapping(value = "/setdata", method = RequestMethod.POST)
	public String setEmployeeData(@RequestBody Employee employee) {
		System.out.println(employee);

		employeeservice.createEmployee(employee);
		return "employee added";
	}

	@RequestMapping(value = "/deletedata", method = RequestMethod.DELETE)
	public String deleteEmployeeData(@RequestParam int id) {
		employeeservice.deleteEmployee(id);
		return "employee deleted sucessfully";
	}

	@RequestMapping(value = "/updatedata", method = RequestMethod.PUT)
	public String updateEmployeeData(@RequestBody Employee employee) {
		employeeservice.updateEmployee(employee);
		return "employee updated sucessfully";
	}

}
