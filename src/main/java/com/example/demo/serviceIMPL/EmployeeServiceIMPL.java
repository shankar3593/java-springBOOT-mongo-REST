package com.example.demo.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.DAO.EmployeeRepository;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

	@Autowired 
	EmployeeRepository employeeRepo;
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int id) {

		Optional<Employee> employees=employeeRepo.findById(id);
		return employees.get();
	}

	@Override
	public void createEmployee(Employee employee) {
		employeeRepo.save(employee);
//		System.out.println("employee added sucessfully");
	}

	@Override
	public void deleteEmployee(int id) {
	
		employeeRepo.deleteById(id);
	}

	@Override
	public void updateEmployee(Employee employee) {

		employeeRepo.save(employee);
		
	}



	
}
