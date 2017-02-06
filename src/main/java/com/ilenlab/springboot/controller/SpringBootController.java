package com.ilenlab.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ilenlab.springboot.dao.EmployeeDAO;
import com.ilenlab.springboot.model.Employee;

@RestController
public class SpringBootController {

	@Autowired
	private EmployeeDAO employeeDAO;

	@RequestMapping("/")
	public String hello(Model model) {
		model.addAttribute("greeting", "Welcome to Spring Boot MVC");
		return "index";
	}

	@RequestMapping(value = "/employees", 
			method = RequestMethod.GET, 
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public List<Employee> getEmployee() {
		List<Employee> lstEmployee = employeeDAO.getListEmployee();
		return lstEmployee;
	}

	@RequestMapping(value = "/employees/{id}", 
			method = RequestMethod.GET, 
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Employee getEmployee(@PathVariable("id") String id) {
		return employeeDAO.getEmployee(id);
	}
	
	@RequestMapping(value = "/employees", 
			method = RequestMethod.POST, 
			produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Employee addEmployee(Employee e) {
		return employeeDAO.addEmployee(e);
	}
	
	@RequestMapping(value = "/employees", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Employee updateEmployee(Employee e) {
		return employeeDAO.updateEmployee(e);
	}
	
	@RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public void deleteEmployee(@PathVariable("id") String id) {
		employeeDAO.deleteEmployee(id);
	}

}
