package com.erpproject.humanresources.repository;

import com.erpproject.humanresources.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
}
