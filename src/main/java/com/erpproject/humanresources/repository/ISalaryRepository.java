package com.erpproject.humanresources.repository;

import com.erpproject.humanresources.entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISalaryRepository extends JpaRepository<Salary, Long> {
}
