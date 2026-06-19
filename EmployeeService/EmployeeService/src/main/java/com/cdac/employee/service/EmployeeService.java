package com.cdac.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.employee.entity.Employee;
import com.cdac.employee.repositor.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }

    public List<Employee> getByDepartment(Long departmentId) {
        return repository.findByDepartmentId(departmentId);
    }

    public List<Employee> searchByName(String name) {
        return repository.findByNameContaining(name);
    }
}
