package com.javabrains.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javabrains.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	Employee findByEmpno(Integer id);
}
