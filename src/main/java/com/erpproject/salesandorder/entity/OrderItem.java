package com.erpproject.salesandorder.entity;

import com.erpproject.stockmanagement.entity.Product;
import jakarta.persistence.*;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long m_id;

    @ManyToOne
    private Order m_order;

    @ManyToOne
    private Product m_product;

    private Integer m_quantity;
    private Double m_price;

    public Long getId()
    {
        return m_id;
    }

    public void setId(Long id)
    {
        m_id = id;
    }

    public Order getOrder()
    {
        return m_order;
    }

    public void setOrder(Order order)
    {
        m_order = order;
    }

    public Product getProduct()
    {
        return m_product;
    }

    public void setProduct(Product product)
    {
        m_product = product;
    }

    public Integer getQuantity()
    {
        return m_quantity;
    }

    public void setQuantity(Integer quantity)
    {
        m_quantity = quantity;
    }

    public Double getPrice()
    {
        return m_price;
    }

    public void setPrice(Double price)
    {
        m_price = price;
    }
}
