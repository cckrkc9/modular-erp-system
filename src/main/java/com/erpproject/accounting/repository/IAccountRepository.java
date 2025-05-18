package com.erpproject.accounting.repository;
import com.erpproject.accounting.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRepository extends JpaRepository<Account, Long> {
}
