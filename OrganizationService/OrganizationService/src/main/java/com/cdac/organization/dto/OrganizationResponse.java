package com.cdac.organization.dto;

public class OrganizationResponse {

    private Employee employee;
    private Department department;

    public OrganizationResponse() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}