package com.erpproject.salesandorder.repository;

import com.erpproject.salesandorder.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderItemRepository extends JpaRepository<OrderItem, Long> {
}
