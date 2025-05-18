package com.erpproject.salesandorder.service;

import com.erpproject.salesandorder.entity.Order;
import com.erpproject.salesandorder.repository.IOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final IOrderRepository m_orderRepository;

    public OrderService(IOrderRepository orderRepository)
    {
        m_orderRepository = orderRepository;
    }

    public List<Order> getAll()
    {
        return m_orderRepository.findAll();
    }

    public Order getById(Long id)
    {
        return m_orderRepository.findById(id).orElseThrow();
    }

    public Order create(Order order)
    {
        return m_orderRepository.save(order);
    }

    public void delete(Long id)
    {
        m_orderRepository.deleteById(id);
    }
}
