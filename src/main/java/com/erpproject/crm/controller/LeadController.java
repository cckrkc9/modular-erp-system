package com.erpproject.crm.controller;

import com.erpproject.crm.entity.Lead;
import com.erpproject.crm.service.LeadService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leads")
public class LeadController {

    private final LeadService m_leadService;

    public LeadController(LeadService leadService)
    {
        this.m_leadService = leadService;
    }

    @GetMapping("get/all")
    public List<Lead> getAll()
    {
        return m_leadService.getAll();
    }

    @GetMapping("get/{id}")
    public Lead getById(@PathVariable Long id)
    {
        return m_leadService.getById(id);
    }

    @PostMapping("create")
    public Lead create(@RequestBody Lead lead)
    {
        return m_leadService.create(lead);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id)
    {
        m_leadService.delete(id);
    }
}
