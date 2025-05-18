package com.erpproject.humanresources.controller;

import com.erpproject.humanresources.entity.Payroll;
import com.erpproject.humanresources.service.PayrollService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payrolls")
public class PayrollController {

    private final PayrollService m_payrollService;

    public PayrollController(PayrollService payrollService)
    {
        m_payrollService = payrollService;
    }

    @GetMapping("get/all")
    public List<Payroll> getAll()
    {
        return m_payrollService.getAll();
    }

    @GetMapping("get/{id}")
    public Payroll getById(@PathVariable Long id)
    {
        return m_payrollService.getById(id);
    }

    @PostMapping("create")
    public Payroll create(@RequestBody Payroll payroll)
    {
        return m_payrollService.create(payroll);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id)
    {
        m_payrollService.delete(id);
    }
}
