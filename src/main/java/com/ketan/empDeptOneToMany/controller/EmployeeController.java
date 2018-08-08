package com.ketan.empDeptOneToMany.controller;

import com.ketan.empDeptOneToMany.domain.Department;
import com.ketan.empDeptOneToMany.domain.Employee;
import com.ketan.empDeptOneToMany.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value="/empSave")
    public String empsave(@RequestBody Employee employee)
    {
        employeeRepo.save(employee);
        return "data saved successfully into employee";
    }

    @GetMapping(value = "/getemp")
    public List<Employee> getdep()
    {
        List<Employee> employees=employeeRepo.findAll();
        return employees;
    }

    @GetMapping(value = "/findById/{department_id}")
    public List<Employee> findById(@PathVariable Integer department_id)
    {
        List<Employee> employees= employeeRepo.findByDepartmentId(department_id);
        return employees;

    }
}
