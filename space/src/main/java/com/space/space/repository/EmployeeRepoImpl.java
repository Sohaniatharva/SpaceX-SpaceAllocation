package com.space.space.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.space.space.model.Employee;
@Repository
public class EmployeeRepoImpl implements EmployeeRep {
    private Map<Integer, Employee> employeeDb;
    @PostConstruct
	public void init() {
		
		employeeDb=new HashMap<>();
		Employee emp1= new Employee(1001, "Kunal", LocalDate.parse("2020-02-10"));
		Employee emp2= new Employee(1002, "Suraj", LocalDate.parse("2021-10-20"));
		Employee emp3= new Employee(1003, "Manish", LocalDate.parse("2020-04-25"));
		
		employeeDb.put(emp1.getId(), emp1);
		employeeDb.put(emp2.getId(), emp2);
		employeeDb.put(emp3.getId(), emp3);
		
	}
    @Override
    public Employee saveEmployee(Employee employee) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Employee getEmployee(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean deleteEmployee(int id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Employee> getAllEmployees() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
