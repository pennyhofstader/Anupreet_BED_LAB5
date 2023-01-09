package com.greatlearning.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.ems.entity.Employee;
import com.greatlearning.ems.repositary.EmployeeRepositary;

@Service
public class EmployeeService implements ServiceInterface {

	@Autowired
	private EmployeeRepositary employeeRepositary;

	// adding the employees
	public void addEmployee(Employee e) {

		employeeRepositary.save(e);
	}

	// fetching employee data
	public List<Employee> getAllEmployees() {

		return employeeRepositary.findAll();

	}

	// getting employee by id
	public Employee getEmpLoyeeById(int id) {
		Optional<Employee> emp = employeeRepositary.findById(id);
		if (emp.isPresent()) {
			return emp.get();
		}

		return null;
	}

	// deleting employee

	public void delete(int id) {
		employeeRepositary.deleteById(id);
	}

}
