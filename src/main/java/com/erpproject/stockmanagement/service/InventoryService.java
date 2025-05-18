package com.erpproject.stockmanagement.service;

import com.erpproject.salesandorder.entity.Order;
import com.erpproject.salesandorder.entity.OrderItem;
import com.erpproject.stockmanagement.entity.Inventory;
import com.erpproject.stockmanagement.repository.IInventoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class InventoryService {

    private final IInventoryRepository m_inventoryRepository;

    public InventoryService(IInventoryRepository inventoryRepository)
    {
        m_inventoryRepository = inventoryRepository;
    }

    public List<Inventory> getAll()
    {
        return m_inventoryRepository.findAll();
    }

    public Inventory getById(Long id)
    {
        return m_inventoryRepository.findById(id).orElseThrow();
    }


    public Inventory create(Inventory inventory)
    {
        return m_inventoryRepository.save(inventory);
    }

    public void delete(Long id)
    {
        m_inventoryRepository.deleteById(id);
    }
}
