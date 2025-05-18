package com.erpproject.stockmanagement.service;

import com.erpproject.salesandorder.entity.Order;
import com.erpproject.stockmanagement.entity.Product;
import com.erpproject.stockmanagement.repository.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final IProductRepository m_productRepository;

    public ProductService(IProductRepository productRepository)
    {
        this.m_productRepository = productRepository;
    }

    public List<Product> getAll()
    {
        return m_productRepository.findAll();
    }

    public Product getById(Long id)
    {
        return m_productRepository.findById(id).orElseThrow();
    }

    public Product create(Product product)
    {
        return m_productRepository.save(product);
    }

    public void delete(Long id)
    {
        m_productRepository.deleteById(id);
    }
}
