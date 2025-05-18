package com.erpproject.salesandorder.repository;

import com.erpproject.salesandorder.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderRepository extends JpaRepository<Order, Long> {
}
