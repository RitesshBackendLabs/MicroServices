package com.cdac.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.department.entity.Department;
import com.cdac.department.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment(Department department) {
        return repository.save(department);
    }

    public List<Department> getAllDepartments() {
        return repository.findAll();
    }

    public Department getDepartmentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteDepartment(Long id) {
        repository.deleteById(id);
    }

    public List<Department> getByLocation(String location) {
        return repository.findByLocation(location);
    }

    public List<Department> searchByName(String name) {
        return repository.findByNameContaining(name);
    }
}