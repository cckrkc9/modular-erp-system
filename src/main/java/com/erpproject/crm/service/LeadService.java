package com.erpproject.crm.service;

import com.erpproject.crm.repository.ILeadRepository;
import com.erpproject.crm.entity.Lead;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeadService {

    private final ILeadRepository m_leadRepository;

    public LeadService(ILeadRepository leadRepository)
    {
        m_leadRepository = leadRepository;
    }

    public List<Lead> getAll()
    {
        return m_leadRepository.findAll();
    }

    public Lead getById(Long id)
    {
        return m_leadRepository.findById(id).orElseThrow();
    }

    public Lead create(Lead lead)
    {
        return m_leadRepository.save(lead);
    }

    public void delete(Long id)
    {
        m_leadRepository.deleteById(id);
    }
}
