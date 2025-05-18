package com.erpproject.stockmanagement.controller;

import com.erpproject.salesandorder.entity.Order;
import com.erpproject.stockmanagement.service.InventoryService;
import com.erpproject.stockmanagement.entity.Inventory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventories")
public class InventoryController {

    private final InventoryService m_inventoryService;

    public InventoryController(InventoryService inventoryService)
    {
        m_inventoryService = inventoryService;
    }

    @GetMapping("get/all")
    public List<Inventory> getAll() {
        return m_inventoryService.getAll();
    }

    @GetMapping("get/{id}")
    public Inventory getById(@PathVariable Long id)
    {
        return m_inventoryService.getById(id);
    }

    @PostMapping("create")
    public Inventory create(@RequestBody Inventory inventory) {
        return m_inventoryService.create(inventory);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id) {
        m_inventoryService.delete(id);
    }
}
