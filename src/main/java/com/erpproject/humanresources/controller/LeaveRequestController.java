package com.erpproject.humanresources.controller;

import com.erpproject.humanresources.entity.LeaveRequest;
import com.erpproject.humanresources.service.LeaveRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/leaverequests")
public class LeaveRequestController {

    private final LeaveRequestService m_leaveRequestService;

    public LeaveRequestController(LeaveRequestService leaveRequestService)
    {
        m_leaveRequestService = leaveRequestService;
    }

    @GetMapping("get/all")
    public List<LeaveRequest> getAll()
    {
        return m_leaveRequestService.getAll();
    }

    @GetMapping("get/{id}")
    public LeaveRequest getById(@PathVariable Long id)
    {
        return m_leaveRequestService.getById(id);
    }

    @PostMapping("create")
    public LeaveRequest create(@RequestBody LeaveRequest leaveRequest)
    {
        return m_leaveRequestService.create(leaveRequest);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id)
    {
        m_leaveRequestService.delete(id);
    }
}
