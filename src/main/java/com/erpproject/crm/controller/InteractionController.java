package com.erpproject.crm.controller;

import com.erpproject.crm.entity.Interaction;
import com.erpproject.crm.service.InteractionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/interactions")
public class InteractionController {

    private final InteractionService m_interactionService;

    public InteractionController(InteractionService interactionService)
    {
        this.m_interactionService = interactionService;
    }

    @GetMapping("get/all")
    public List<Interaction> getAll()
    {
        return m_interactionService.getAll();
    }

    @GetMapping("get/{id}")
    public Interaction getById(@PathVariable Long id)
    {
        return m_interactionService.getById(id);
    }

    @PostMapping("create")
    public Interaction create(@RequestBody Interaction interaction)
    {
        return m_interactionService.create(interaction);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id)
    {
        m_interactionService.delete(id);
    }
}
