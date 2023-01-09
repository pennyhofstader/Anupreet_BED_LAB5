package com.greatlearning.ems.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.ems.entity.Employee;

@Repository
public interface EmployeeRepositary extends JpaRepository<Employee, Integer> {

}
