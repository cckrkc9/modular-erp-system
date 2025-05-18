package com.erpproject.humanresources.repository;

import com.erpproject.humanresources.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDepartmentRepository extends JpaRepository<Department, Long> {
}
