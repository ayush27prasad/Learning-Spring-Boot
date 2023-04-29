package com.dailycodebuffer.SpringBoot.tutorial.service;

import com.dailycodebuffer.SpringBoot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {

    public List<Department> fetchDepartmentList();

    public Department saveDepartment(Department department);

    public Department fetchDepartmentbyID(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);

    public void deleteDepartmentbyID(Long departmentId);
}
