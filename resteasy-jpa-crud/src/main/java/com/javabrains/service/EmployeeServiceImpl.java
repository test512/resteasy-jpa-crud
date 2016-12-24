package com.javabrains.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.javabrains.model.Employee;
import com.javabrains.repository.EmployeeRepository;


@Controller
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void doAction() {
		
	}

	@Override
	public Employee createEmployee(Integer id, String name) {
		Employee e = new Employee();
		e.setEmpno(id);
		e.setEname(name);
		
		employeeRepository.save(e);
		return e;
	}

	@Override
	public void removeEmployee(Integer id) {
		Employee e = employeeRepository.findByEmpno(id);
		if(e != null){
			employeeRepository.delete(id);
		}
	}

	@Override
	public Employee findEmployee(Integer id) {
		return employeeRepository.findByEmpno(id);
	}

	@Override
	public Collection<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}
}
