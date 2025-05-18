package com.erpproject.stockmanagement.controller;

import com.erpproject.stockmanagement.entity.Inventory;
import com.erpproject.stockmanagement.service.WarehouseService;
import com.erpproject.stockmanagement.entity.Warehouse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/warehouses")
public class WarehouseController {

    private final WarehouseService m_warehouseService;

    public WarehouseController(WarehouseService warehouseService) {
        this.m_warehouseService = warehouseService;
    }

    @GetMapping("get/all")
    public List<Warehouse> getAll() {
        return m_warehouseService.getAll();
    }

    @GetMapping("get/{id}")
    public Warehouse getById(@PathVariable Long id)
    {
        return m_warehouseService.getById(id);
    }

    @PostMapping("create")
    public Warehouse create(@RequestBody Warehouse warehouse) {
        return m_warehouseService.create(warehouse);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id) {
        m_warehouseService.delete(id);
    }
}
