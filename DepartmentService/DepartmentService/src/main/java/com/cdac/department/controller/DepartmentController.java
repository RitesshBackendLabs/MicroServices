package com.cdac.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cdac.department.entity.Department;
import com.cdac.department.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping
    public Department addDepartment(
            @RequestBody Department department) {

        return service.saveDepartment(department);
    }

    @GetMapping
    public List<Department> getAllDepartments() {

        return service.getAllDepartments();
    }

    @GetMapping("/{id}")
    public Department getDepartment(
            @PathVariable Long id) {

        return service.getDepartmentById(id);
    }

    @PutMapping
    public Department updateDepartment(
            @RequestBody Department department) {

        return service.saveDepartment(department);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartment(
            @PathVariable Long id) {

        service.deleteDepartment(id);

        return "Department Deleted";
    }

    @GetMapping("/location/{location}")
    public List<Department> getByLocation(
            @PathVariable String location) {

        return service.getByLocation(location);
    }

    @GetMapping("/search/{name}")
    public List<Department> searchByName(
            @PathVariable String name) {

        return service.searchByName(name);
    }
}