package com.erpproject.accounting.service;

import com.erpproject.accounting.entity.Account;
import com.erpproject.accounting.repository.IAccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final IAccountRepository m_accountRepository;

    public AccountService(IAccountRepository accountRepository)
    {
        this.m_accountRepository = accountRepository;
    }

    public List<Account> getAll()
    {
        return m_accountRepository.findAll();
    }

    public Account getById(Long id)
    {
        return m_accountRepository.findById(id).orElseThrow();
    }

    public Account create(Account account)
    {
        return m_accountRepository.save(account);
    }

    public void delete(Long id)
    {
        m_accountRepository.deleteById(id);
    }
}
