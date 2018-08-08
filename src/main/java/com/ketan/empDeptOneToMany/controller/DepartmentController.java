package com.ketan.empDeptOneToMany.controller;

import com.ketan.empDeptOneToMany.domain.Department;
import com.ketan.empDeptOneToMany.domain.Employee;
import com.ketan.empDeptOneToMany.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController
{
    @Autowired
    private DepartmentRepo departmentRepo;

    @PostMapping(value="/deptsave")
    public String deptsave(@RequestBody Department department)
    {
        departmentRepo.save(department);
        return "saved successfully into departmrnt";
    }

    @GetMapping(value = "/getdep")
    public List<Department> getdep()
    {
        List<Department> departments=departmentRepo.findAll();
        return departments;
    }



}
