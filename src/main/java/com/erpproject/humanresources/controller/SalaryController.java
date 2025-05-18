package com.erpproject.humanresources.controller;

import com.erpproject.humanresources.entity.Salary;
import com.erpproject.humanresources.service.SalaryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salaries")
public class SalaryController {

    private final SalaryService m_salaryService;

    public SalaryController(SalaryService salaryService)
    {
        m_salaryService = salaryService;
    }

    @GetMapping("get/all")
    public List<Salary> getAll()
    {
        return m_salaryService.getAll();
    }

    @GetMapping("get/{id}")
    public Salary getById(@PathVariable Long id)
    {
        return m_salaryService.getById(id);
    }

    @PostMapping("create")
    public Salary create(@RequestBody Salary salary)
    {
        return m_salaryService.create(salary);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id)
    {
        m_salaryService.delete(id);
    }
}
