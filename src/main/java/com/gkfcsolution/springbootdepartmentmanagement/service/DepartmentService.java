package com.gkfcsolution.springbootdepartmentmanagement.service;

import com.gkfcsolution.springbootdepartmentmanagement.entity.Department;
import com.gkfcsolution.springbootdepartmentmanagement.exception.DepartmentNotFounException;

import java.util.List;

/**
 * Created on 2025 at 15:54
 * File: null.java
 * Project: springBoot-department-management
 *
 * @author Frank GUEKENG
 * @date 03/10/2025
 * @time 15:54
 */
public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long id) throws DepartmentNotFounException;

    void deleteDepartmentById(Long id);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);

    Department fetchDepartmentByNameIgnoreCase(String departmentName);
}
