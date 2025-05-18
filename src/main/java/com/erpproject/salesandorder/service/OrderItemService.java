package com.erpproject.salesandorder.service;

import com.erpproject.salesandorder.entity.OrderItem;
import com.erpproject.salesandorder.repository.IOrderItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemService {

    private final IOrderItemRepository m_orderItemRepository;

    public OrderItemService(IOrderItemRepository orderItemRepository)
    {
        m_orderItemRepository = orderItemRepository;
    }

    public List<OrderItem> getAll()
    {
        return m_orderItemRepository.findAll();
    }

    public OrderItem getById(Long id)
    {
        return m_orderItemRepository.findById(id).orElseThrow();
    }

    public OrderItem create(OrderItem orderItem)
    {
        return m_orderItemRepository.save(orderItem);
    }

    public void delete(Long id)
    {
        m_orderItemRepository.deleteById(id);
    }
}
