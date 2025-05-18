package com.erpproject.humanresources.service;

import com.erpproject.humanresources.repository.ILeaveRequestRepository;
import com.erpproject.humanresources.entity.LeaveRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveRequestService {

    private final ILeaveRequestRepository m_leaveRequestRepository;

    public LeaveRequestService(ILeaveRequestRepository leaveRequestRepository)
    {
        m_leaveRequestRepository = leaveRequestRepository;
    }

    public List<LeaveRequest> getAll()
    {
        return m_leaveRequestRepository.findAll();
    }

    public LeaveRequest getById(Long id)
    {
        return m_leaveRequestRepository.findById(id).orElseThrow();
    }

    public LeaveRequest create(LeaveRequest leaveRequest)
    {
        return m_leaveRequestRepository.save(leaveRequest);
    }

    public void delete(Long id)
    {
        m_leaveRequestRepository.deleteById(id);
    }
}
