package com.erpproject.crm.repository;

import com.erpproject.crm.entity.Interaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInteractionRepository extends JpaRepository<Interaction, Long> {
}
