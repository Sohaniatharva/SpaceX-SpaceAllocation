package com.space.space.service;

import com.space.space.model.Employee;
import com.space.space.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployee(){
        return employeeRepo.findAll();
    }

    public Employee addEmployee(Employee employee){
        return employeeRepo.save(employee);
    }
}
