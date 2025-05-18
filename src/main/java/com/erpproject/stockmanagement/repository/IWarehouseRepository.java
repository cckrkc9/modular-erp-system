package com.erpproject.stockmanagement.repository;

import com.erpproject.stockmanagement.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
public interface IWarehouseRepository extends JpaRepository<Warehouse, Long> {
}
