package com.erpproject.crm.repository;

import com.erpproject.crm.entity.Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILeadRepository extends JpaRepository<Lead, Long> {
}
