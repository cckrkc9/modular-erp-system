package com.cancikrikci.app.payroll.controller;

import com.cancikrikci.app.payroll.entity.EmployeeSalary;
import com.cancikrikci.app.payroll.entity.EmployeeInsurance;
import com.cancikrikci.app.payroll.service.PayrollService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/payroll")
public class PayrollController {
    private final PayrollService m_payrollService;

    public PayrollController(PayrollService payrollService)
    {
        m_payrollService = payrollService;
    }

    // Employee Salary Endpoints
    @GetMapping("salaries")
    public List<EmployeeSalary> getAllSalaries()
    {
        return m_payrollService.getAllSalaries();
    }

    @GetMapping("salaries/{id}")
    public EmployeeSalary getSalaryById(@PathVariable(name = "id") int id)
    {
        return m_payrollService.getSalaryById(id);
    }

    @GetMapping("salaries/employee/{employeeId}")
    public List<EmployeeSalary> getSalariesByEmployeeId(@PathVariable(name = "employeeId") int employeeId)
    {
        return m_payrollService.getSalariesByEmployeeId(employeeId);
    }

    @PostMapping("salaries/save")
    public EmployeeSalary saveSalary(@RequestBody EmployeeSalary salary)
    {
        return m_payrollService.saveSalary(salary);
    }

    @DeleteMapping("salaries/delete/{id}")
    public void deleteSalary(@PathVariable(name = "id") int id)
    {
        m_payrollService.deleteSalary(id);
    }

    @GetMapping("insurances")
    public List<EmployeeInsurance> getAllInsurances()
    {
        return m_payrollService.getAllInsurances();
    }

    @GetMapping("insurances/{id}")
    public EmployeeInsurance getInsuranceById(@PathVariable(name = "id") int id)
    {
        return m_payrollService.getInsuranceById(id);
    }

    @GetMapping("insurances/employee/{employeeId}")
    public List<EmployeeInsurance> getInsurancesByEmployeeId(@PathVariable(name = "employeeId") int employeeId)
    {
        return m_payrollService.getInsurancesByEmployeeId(employeeId);
    }

    @PostMapping("insurances/save")
    public EmployeeInsurance saveInsurance(@RequestBody EmployeeInsurance insurance)
    {
        return m_payrollService.saveInsurance(insurance);
    }

    @DeleteMapping("insurances/delete/{id}")
    public void deleteInsurance(@PathVariable(name = "id") int id)
    {
        m_payrollService.deleteInsurance(id);
    }
} 