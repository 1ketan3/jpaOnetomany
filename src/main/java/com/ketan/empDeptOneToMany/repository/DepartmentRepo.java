package com.ketan.empDeptOneToMany.repository;

import com.ketan.empDeptOneToMany.domain.Department;
import com.ketan.empDeptOneToMany.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer>
{
    Department findById(Integer department_id);
}
