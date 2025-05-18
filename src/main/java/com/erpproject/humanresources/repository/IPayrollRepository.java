package com.erpproject.humanresources.repository;

import com.erpproject.humanresources.entity.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPayrollRepository extends JpaRepository<Payroll, Long> {
}
