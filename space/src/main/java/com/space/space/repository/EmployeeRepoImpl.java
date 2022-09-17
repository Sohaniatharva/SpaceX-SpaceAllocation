package com.space.space.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.space.space.model.DepartmentOECode;
import com.space.space.model.Employee;
import com.space.space.model.TeamOECode;
@Repository
public class EmployeeRepoImpl implements EmployeeRep {
    private Map<Integer, Employee> employeeDb;
    @PostConstruct
	public void init() {
		
		employeeDb=new HashMap<>();
		Employee emp1= new Employee(1011,"Sejal Jaiswal", null, "VP","MB", TeamOECode.MBLE,DepartmentOECode.TLM, "Kartikeya");
        Employee emp1= new Employee(1012,"Atul Kumar Gupta", null, "AVP","MB", TeamOECode.MBLE,DepartmentOECode.TLM, "Kartikeya");
		
		
		
		
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
