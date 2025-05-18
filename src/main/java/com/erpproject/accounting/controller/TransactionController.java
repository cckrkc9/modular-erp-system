package com.erpproject.accounting.controller;

import com.erpproject.accounting.entity.Account;
import com.erpproject.accounting.entity.Transaction;
import com.erpproject.accounting.service.AccountService;
import com.erpproject.accounting.service.TransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService m_transactionService;

    public TransactionController(TransactionService transactionService)
    {
        m_transactionService = transactionService;
    }

    @GetMapping("get/all")
    public List<Transaction> getAll()
    {
        return m_transactionService.getAll();
    }

    @GetMapping("get/{id}")
    public Transaction getById(@PathVariable Long id)
    {
        return m_transactionService.getById(id);
    }

    @PostMapping("create")
    public Transaction create(@RequestBody Transaction transaction)
    {
        return m_transactionService.create(transaction);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id)
    {
        m_transactionService.delete(id);
    }
}
