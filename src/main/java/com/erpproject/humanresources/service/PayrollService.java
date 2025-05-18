package com.erpproject.humanresources.service;

import com.erpproject.humanresources.repository.IPayrollRepository;
import com.erpproject.humanresources.entity.Payroll;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PayrollService {

    private final IPayrollRepository m_payrollRepository;

    public PayrollService(IPayrollRepository payrollRepository)
    {
        m_payrollRepository = payrollRepository;
    }

    public List<Payroll> getAll()
    {
        return m_payrollRepository.findAll();
    }

    public Payroll getById(Long id)
    {
        return m_payrollRepository.findById(id).orElseThrow();
    }

    public Payroll create(Payroll payroll)
    {
        payroll.setTotalSalary(calculateTotalSalary(payroll));
        return m_payrollRepository.save(payroll);
    }

    public void delete(Long id)
    {
        m_payrollRepository.deleteById(id);
    }

    private BigDecimal calculateTotalSalary(Payroll payroll)
    {
        return payroll.getTotalSalary().add(payroll.getBonus()).subtract(payroll.getDeductions());
    }
}
