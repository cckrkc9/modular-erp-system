package com.erpproject.salesandorder.controller;

import com.erpproject.salesandorder.service.OrderService;
import com.erpproject.salesandorder.entity.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService m_orderService;

    public OrderController(OrderService orderService)
    {
        m_orderService = orderService;
    }

    @GetMapping("get/all")
    public List<Order> getAll()
    {
        return m_orderService.getAll();
    }

    @GetMapping("get/{id}")
    public Order getById(@PathVariable Long id)
    {
        return m_orderService.getById(id);
    }

    @PostMapping("create")
    public Order create(@RequestBody Order order)
    {
        return m_orderService.create(order);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id)
    {
        m_orderService.delete(id);
    }
}
