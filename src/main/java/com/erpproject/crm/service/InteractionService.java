package com.erpproject.crm.service;

import com.erpproject.crm.entity.Interaction;
import com.erpproject.crm.repository.IInteractionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteractionService {

    private final IInteractionRepository m_interactionRepository;

    public InteractionService(IInteractionRepository interactionRepository)
    {
        this.m_interactionRepository = interactionRepository;
    }

    public List<Interaction> getAll()
    {
        return m_interactionRepository.findAll();
    }

    public Interaction getById(Long id)
    {
        return m_interactionRepository.findById(id).orElseThrow();
    }

    public Interaction create(Interaction interaction)
    {
        return m_interactionRepository.save(interaction);
    }

    public void delete(Long id)
    {
        m_interactionRepository.deleteById(id);
    }
}
