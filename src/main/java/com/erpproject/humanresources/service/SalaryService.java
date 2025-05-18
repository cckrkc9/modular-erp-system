package com.erpproject.humanresources.service;

import com.erpproject.humanresources.entity.Salary;
import com.erpproject.humanresources.repository.ISalaryRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class SalaryService {

    private final ISalaryRepository m_salaryRepository;

    public SalaryService(ISalaryRepository salaryRepository)
    {
        this.m_salaryRepository = salaryRepository;
    }

    public List<Salary> getAll()
    {
        return m_salaryRepository.findAll();
    }

    public Salary getById(Long id)
    {
        return m_salaryRepository.findById(id).orElseThrow();
    }

    public Salary create(Salary salary)
    {
        salary.setNetSalary(calculateNetSalary(salary));
        return m_salaryRepository.save(salary);
    }

    public void delete(Long id)
    {
        m_salaryRepository.deleteById(id);
    }

    private BigDecimal calculateNetSalary(Salary salary)
    {
        return salary.getBaseSalary().add(salary.getBonus()).subtract(salary.getDeductions());
    }
}
