package com.erpproject.crm.service;

import com.erpproject.crm.entity.Customer;
import com.erpproject.crm.repository.ICustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final ICustomerRepository m_customerRepository;

    public CustomerService(ICustomerRepository customerRepository)
    {
        this.m_customerRepository = customerRepository;
    }

    public List<Customer> getAll()
    {
        return m_customerRepository.findAll();
    }
    public Customer getById(Long id)
    {
        return m_customerRepository.findById(id).orElseThrow();
    }


    public Customer create(Customer customer)
    {
        return m_customerRepository.save(customer);
    }

    public void delete(Long id) {
        m_customerRepository.deleteById(id);
    }
}
