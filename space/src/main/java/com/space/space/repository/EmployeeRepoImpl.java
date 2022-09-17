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
		Employee Sejal_Jaiswal= new Employee(1011,"Sejal Jaiswal", null, "VP","MB", TeamOECode.MBLE,DepartmentOECode.TLM, "Kartikeya");
        Employee Atul_Kumar_Gupta= new Employee(1012,"Atul Kumar Gupta", Sejal_Jaiswal, "AVP","MB", TeamOECode.MBLE,DepartmentOECode.TLM, "Sejal Jaiswal");
        Employee Atharva_Sohani= new Employee(1013,"Atharva Sohani", Sejal_Jaiswal, "AVP","MB", TeamOECode.MBLE,DepartmentOECode.TLM, "Bhot Sare");
        Employee Kushagra_Upadhyay= new Employee(1013,"Kushagra Upadhyay", Sejal_Jaiswal, "AVP","MB", TeamOECode.MBLE,DepartmentOECode.TLM, "Kartik Bansal");
		
		
		
		
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
    @Override
    public Employee updateEmployee(Employee employee){
        return null;
    }
    
}
