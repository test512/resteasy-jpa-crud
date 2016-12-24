package com.javabrains.service;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.javabrains.model.Employee;


@Path("/employeeService")
public interface EmployeeService {
	public void doAction();

	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes("application/x-www-form-urlencoded")
	public Employee createEmployee(Integer id, String name);

	@POST
	@Path("/removeemployee")
	@Consumes("application/x-www-form-urlencoded")
	@Produces(MediaType.TEXT_HTML)  
	public void removeEmployee(Integer id);

	@POST
	@Path("/findemployee")
	@Produces(MediaType.APPLICATION_XML)  
	@Consumes("application/x-www-form-urlencoded")
	public Employee findEmployee(Integer id);

	@GET
	@Produces(MediaType.APPLICATION_XML)  
	@Path("/findall")
	public Collection<Employee> findAllEmployees() ;
}
