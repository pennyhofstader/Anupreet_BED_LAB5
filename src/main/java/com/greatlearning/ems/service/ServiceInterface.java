package com.greatlearning.ems.service;

import java.util.List;

import com.greatlearning.ems.entity.Employee;

public interface ServiceInterface {

	public void addEmployee(Employee e);

	public List<Employee> getAllEmployees();

	public Employee getEmpLoyeeById(int id);

	public void delete(int id);

}
