package com.erpproject.humanresources.service;

import com.erpproject.humanresources.entity.Employee;
import com.erpproject.humanresources.repository.IEmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final IEmployeeRepository m_employeeRepository;

    public EmployeeService(IEmployeeRepository employeeRepository)
    {
        m_employeeRepository = employeeRepository;
    }

    public List<Employee> getAll()
    {
        return m_employeeRepository.findAll();
    }

    public Employee getById(Long id)
    {
        return m_employeeRepository.findById(id).orElseThrow();
    }

    public Employee create(Employee employee)
    {
        return m_employeeRepository.save(employee);
    }

    public void delete(Long id)
    {
        m_employeeRepository.deleteById(id);
    }
}
