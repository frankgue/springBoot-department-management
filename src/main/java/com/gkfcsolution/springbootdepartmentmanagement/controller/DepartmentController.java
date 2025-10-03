package com.gkfcsolution.springbootdepartmentmanagement.controller;

import com.gkfcsolution.springbootdepartmentmanagement.entity.Department;
import com.gkfcsolution.springbootdepartmentmanagement.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created on 2025 at 15:53
 * File: null.java
 * Project: springBoot-department-management
 *
 * @author Frank GUEKENG
 * @date 03/10/2025
 * @time 15:53
 */
@RestController
@RequestMapping("/api/gateway/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department saveDepartment(@Valid @RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping
    public List<Department> fetchDepartmentList(){
        return departmentService.fetchDepartmentList();
    }

    @GetMapping(value = "/{id}")
    public Department fetchDepartmentById(@PathVariable Long id){
        return departmentService.fetchDepartmentById(id);
    }

    @DeleteMapping(value = "/{id}")
    public String deleteDepartmentById(@PathVariable Long id){
        departmentService.deleteDepartmentById(id);
        return "Department deleted Successfully!!";
    }

    @PutMapping(value = "/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
      return   departmentService.updateDepartment(departmentId, department);
    }

//    @GetMapping(value = "/name/{name}")
//    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
//        return departmentService.fetchDepartmentByName(departmentName);
//    }
    @GetMapping(value = "/name/{name}")
    public Department fetchDepartmentByNameIgnoreCase(@PathVariable("name") String departmentName){
        return departmentService.fetchDepartmentByNameIgnoreCase(departmentName);
    }
}
