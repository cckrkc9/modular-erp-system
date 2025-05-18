package com.erpproject.stockmanagement.controller;

import com.erpproject.stockmanagement.entity.Inventory;
import com.erpproject.stockmanagement.entity.Product;
import com.erpproject.stockmanagement.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService m_productService;

    public ProductController(ProductService productService)
    {
        this.m_productService = productService;
    }

    @GetMapping("get/all")
    public List<Product> getAll()
    {
        return m_productService.getAll();
    }

    @GetMapping("get/{id}")
    public Product getById(@PathVariable Long id)
    {
        return m_productService.getById(id);
    }

    @PostMapping("create")
    public Product create(@RequestBody Product product)
    {
        return m_productService.create(product);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id)
    {
        m_productService.delete(id);
    }
}
