package com.erpproject.stockmanagement.service;

import com.erpproject.salesandorder.entity.Order;
import com.erpproject.stockmanagement.entity.Warehouse;
import com.erpproject.stockmanagement.repository.IWarehouseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {
    private final IWarehouseRepository m_warehouseRepository;

    public WarehouseService(IWarehouseRepository warehouseRepository)
    {
        this.m_warehouseRepository = warehouseRepository;
    }

    public List<Warehouse> getAll()
    {
        return m_warehouseRepository.findAll();
    }

    public Warehouse getById(Long id)
    {
        return m_warehouseRepository.findById(id).orElseThrow();
    }


    public Warehouse create(Warehouse warehouse)
    {
        return m_warehouseRepository.save(warehouse);
    }

    public void delete(Long id)
    {
        m_warehouseRepository.deleteById(id);
    }
}
