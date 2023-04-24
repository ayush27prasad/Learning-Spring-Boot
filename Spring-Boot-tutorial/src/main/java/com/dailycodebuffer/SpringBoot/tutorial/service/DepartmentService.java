package com.dailycodebuffer.SpringBoot.tutorial.service;

import com.dailycodebuffer.SpringBoot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();
}
