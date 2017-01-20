package com.ilenlab.springboot.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ilenlab.springboot.model.Employee;

public class EmployeeDAO {
	private static final Map<String, Employee> mapEmpployee = new HashMap<String, Employee>();
	static {
		dataDump();
	}
	private static void dataDump() {
		Employee e1 = new Employee("E01", "Tran", "Dev");
		Employee e2 = new Employee("E02", "Nguyen", "QA");
		Employee e3 = new Employee("E03", "Le", "Admin");
		mapEmpployee.put(e1.getNo(), e1);
		mapEmpployee.put(e2.getNo(), e2);
		mapEmpployee.put(e3.getNo(), e3);
	}
	
	public Employee getEmployee(String no) {
		return mapEmpployee.get(no);
	}
	
	public Employee addEmployee(Employee emp) {
		mapEmpployee.put(emp.getNo(), emp);
		return emp;
	}
	
	public Employee updateEmployee(Employee emp) {
		mapEmpployee.put(emp.getNo(), emp);
		return emp;
	}
	
	public void deleteEmployee(String no) {
		mapEmpployee.remove(no);
	}
	
	public List<Employee> getListEmployee() {
		Collection<Employee> collection = mapEmpployee.values();
		List<Employee> lstEmployee = new ArrayList<Employee>();
		lstEmployee.addAll(collection);
		return lstEmployee;
	}
}
