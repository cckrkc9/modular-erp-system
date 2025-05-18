package com.erpproject.humanresources.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Payroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal basicSalary;
    private BigDecimal bonus;
    private BigDecimal deductions;
    private BigDecimal totalSalary;

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

    public BigDecimal getBasicSalary()
    {
        return basicSalary;
    }

    public void setBasicSalary(BigDecimal basicSalary)
    {
        this.basicSalary = basicSalary;
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

    public BigDecimal getTotalSalary()
    {
        return totalSalary;
    }

    public void setTotalSalary(BigDecimal totalSalary)
    {
        this.totalSalary = totalSalary;
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
