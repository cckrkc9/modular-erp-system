package com.erpproject.salesandorder.entity;

import com.erpproject.crm.entity.Customer;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long m_id;

    @ManyToOne
    private Customer m_customer;

    private LocalDateTime m_orderDate;
    private String m_status;

    public Long getId()
    {
        return m_id;
    }

    public void setId(Long id)
    {
        m_id = id;
    }

    public Customer getCustomer()
    {
        return m_customer;
    }

    public void setCustomer(Customer customer)
    {
        m_customer = customer;
    }

    public LocalDateTime getOrderDate()
    {
        return m_orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate)
    {
        m_orderDate = orderDate;
    }

    public String getStatus()
    {
        return m_status;
    }

    public void setStatus(String status)
    {
        m_status = status;
    }
}
