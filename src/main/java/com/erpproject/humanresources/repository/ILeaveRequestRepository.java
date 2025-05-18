package com.erpproject.humanresources.repository;

import com.erpproject.humanresources.entity.LeaveRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILeaveRequestRepository extends JpaRepository<LeaveRequest, Long> {
}
