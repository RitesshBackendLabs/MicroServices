package com.cdac.organization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cdac.organization.dto.OrganizationResponse;
import com.cdac.organization.service.OrganizationService;

@RestController
@RequestMapping("/organization")
public class OrganizationController {

    @Autowired
    private OrganizationService service;

    @GetMapping("/{employeeId}")
    public OrganizationResponse getDetails(
            @PathVariable Long employeeId) {

        return service.getEmployeeDepartment(employeeId);
    }
}