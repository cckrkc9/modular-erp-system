package com.erpproject.crm.controller;

import com.erpproject.crm.entity.Customer;
import com.erpproject.crm.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService m_customerService;

    public CustomerController(CustomerService customerService)
    {
        this.m_customerService = customerService;
    }

    @GetMapping("get/all")
    public List<Customer> getAll()
    {
        return m_customerService.getAll();
    }
    @GetMapping("get/{id}")
    public Customer getById(@PathVariable Long id)
    {
        return m_customerService.getById(id);
    }

    @PostMapping("create")
    public Customer create(@RequestBody Customer customer)
    {
        return m_customerService.create(customer);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id)
    {
        m_customerService.delete(id);
    }
}
