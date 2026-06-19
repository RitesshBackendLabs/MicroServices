package com.cdac.organization.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.organization.dto.Department;
import com.cdac.organization.dto.Employee;
import com.cdac.organization.dto.OrganizationResponse;
import com.cdac.organization.feign.DepartmentClient;
import com.cdac.organization.feign.EmployeeClient;

@Service
public class OrganizationService {

    @Autowired
    private EmployeeClient employeeClient;

    @Autowired
    private DepartmentClient departmentClient;

    public OrganizationResponse getEmployeeDepartment(Long empId) {

        Employee employee =
                employeeClient.getEmployee(empId);

        Department department =
                departmentClient.getDepartment(
                        employee.getDepartmentId());

        OrganizationResponse response =
                new OrganizationResponse();

        response.setEmployee(employee);
        response.setDepartment(department);

        return response;
    }
}