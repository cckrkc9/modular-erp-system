package com.erpproject.stockmanagement.repository;

import com.erpproject.stockmanagement.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
public interface IInventoryRepository extends JpaRepository<Inventory, Long>  {
}
