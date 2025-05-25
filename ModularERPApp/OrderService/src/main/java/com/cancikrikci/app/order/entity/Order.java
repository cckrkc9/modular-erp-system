package com.cancikrikci.app.order.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    public int id;

    @Column(name = "customer_id")
    public Integer customerId;

    @Column(name = "order_date", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    public LocalDate orderDate = LocalDate.now();

    @Column(name = "total_amount")
    public BigDecimal totalAmount;

    @Column(name = "status", length = 50)
    public String status;

    @Column(name = "description")
    public String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    public List<OrderProduct> products;
} 