package com.erpproject.humanresources.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal baseSalary;
    private BigDecimal bonus;
    private BigDecimal deductions;
    private BigDecimal netSalary;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public BigDecimal getBaseSalary()
    {
        return baseSalary;
    }

    public void setBaseSalary(BigDecimal baseSalary)
    {
        this.baseSalary = baseSalary;
    }

    public BigDecimal getBonus()
    {
        return bonus;
    }

    public void setBonus(BigDecimal bonus)
    {
        this.bonus = bonus;
    }

    public BigDecimal getDeductions()
    {
        return deductions;
    }

    public void setDeductions(BigDecimal deductions)
    {
        this.deductions = deductions;
    }

    public BigDecimal getNetSalary()
    {
        return netSalary;
    }

    public void setNetSalary(BigDecimal netSalary)
    {
        this.netSalary = netSalary;
    }

    public Employee getEmployee()
    {
        return employee;
    }

    public void setEmployee(Employee employee)
    {
        this.employee = employee;
    }
}
