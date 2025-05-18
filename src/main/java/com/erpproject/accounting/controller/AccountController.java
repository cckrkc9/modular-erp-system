package com.erpproject.accounting.controller;

import com.erpproject.accounting.entity.Account;
import com.erpproject.accounting.service.AccountService;
import com.erpproject.crm.entity.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService m_accountService;

    public AccountController(AccountService accountService)
    {
        m_accountService = accountService;
    }

    @GetMapping("get/all")
    public List<Account> getAll()
    {
        return m_accountService.getAll();
    }

    @GetMapping("get/{id}")
    public Account getById(@PathVariable Long id)
    {
        return m_accountService.getById(id);
    }

    @PostMapping("create")
    public Account create(@RequestBody Account account)
    {
        return m_accountService.create(account);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id)
    {
        m_accountService.delete(id);
    }
}
