package com.erpproject.salesandorder.controller;

import com.erpproject.salesandorder.service.OrderItemService;
import com.erpproject.salesandorder.entity.OrderItem;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order-items")
public class OrderItemController {

    private final OrderItemService orderItemService;

    public OrderItemController(OrderItemService orderItemService)
    {
        this.orderItemService = orderItemService;
    }

    @GetMapping("get/all")
    public List<OrderItem> getAll()
    {
        return orderItemService.getAll();
    }

    @GetMapping("get/{id}")
    public OrderItem getById(@PathVariable Long id)
    {
        return orderItemService.getById(id);
    }

    @PostMapping("create")
    public OrderItem create(@RequestBody OrderItem orderItem)
    {
        return orderItemService.create(orderItem);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id)
    {
        orderItemService.delete(id);
    }
}
