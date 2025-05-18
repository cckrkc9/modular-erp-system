package com.erpproject.humanresources.controller;

import com.erpproject.humanresources.entity.Employee;
import com.erpproject.humanresources.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService m_employeeService;

    public EmployeeController(EmployeeService employeeService)
    {
        m_employeeService = employeeService;
    }

    @GetMapping("get/all")
    public List<Employee> getAll()
    {
        return m_employeeService.getAll();
    }

    @GetMapping("get/{id}")
    public Employee getById(@PathVariable Long id)
    {
        return m_employeeService.getById(id);
    }

    @PostMapping("create")
    public Employee create(@RequestBody Employee employee)
    {
        return m_employeeService.create(employee);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id)
    {
        m_employeeService.delete(id);
    }
}
