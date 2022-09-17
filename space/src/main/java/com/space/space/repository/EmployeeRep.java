package com.space.space.repository;

import java.util.List;

import com.space.space.model.Employee;

public interface EmployeeRep {
    public Employee saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public boolean deleteEmployee(int id);
    public List<Employee> getAllEmployees();
}


/*{
	
	
	
	
	
	
	
	

} */