package com.ketan.empDeptOneToMany.repository;

import com.ketan.empDeptOneToMany.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Integer>
{

    List<Employee> findByDepartmentId(Integer department_id);

}
