package com.erpproject.crm.repository;

import com.erpproject.crm.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
}
