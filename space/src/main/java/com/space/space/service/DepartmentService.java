package com.space.space.service;

import com.space.space.model.Department;
import com.space.space.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepo departmentRepo;

    public Department addDepartment(Department department) {
        return departmentRepo.save(department);
    }

    public Department updateDepartment(Department department) {
        return departmentRepo.save(department);
    }

    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }

    public Department getDepartmentById(String id) {
        return departmentRepo.findById(id).get();
    }

    public boolean deleteDepartmentById(String id) {
        departmentRepo.deleteById(id);
        return !departmentRepo.existsById(id);
    }
}
