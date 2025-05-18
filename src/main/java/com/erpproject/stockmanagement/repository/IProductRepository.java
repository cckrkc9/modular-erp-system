package com.erpproject.stockmanagement.repository;

import com.erpproject.stockmanagement.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface IProductRepository extends JpaRepository<Product, Long> {
}
