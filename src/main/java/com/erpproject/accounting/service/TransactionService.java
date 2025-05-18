package com.erpproject.accounting.service;

import com.erpproject.accounting.entity.Transaction;
import com.erpproject.accounting.repository.ITransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private final ITransactionRepository m_transactionRepository;

    public TransactionService(ITransactionRepository transactionRepository)
    {
        m_transactionRepository = transactionRepository;
    }

    public List<Transaction> getAll()
    {
        return m_transactionRepository.findAll();
    }

    public Transaction getById(Long id)
    {
        return m_transactionRepository.findById(id).orElseThrow();
    }

    public Transaction create(Transaction transaction)
    {
        return m_transactionRepository.save(transaction);
    }

    public void delete(Long id)
    {
        m_transactionRepository.deleteById(id);
    }
}
