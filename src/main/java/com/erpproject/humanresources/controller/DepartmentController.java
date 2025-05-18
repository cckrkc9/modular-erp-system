package com.erpproject.humanresources.controller;

import com.erpproject.humanresources.entity.Department;
import com.erpproject.humanresources.service.DepartmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    private final DepartmentService m_departmentService;

    public DepartmentController(DepartmentService departmentService)
    {
        m_departmentService = departmentService;
    }

    @GetMapping("get/all")
    public List<Department> getAll()
    {
        return m_departmentService.getAll();
    }

    @GetMapping("get/{id}")
    public Department getById(@PathVariable Long id)
    {
        return m_departmentService.getById(id);
    }

    @PostMapping("create")
    public Department create(@RequestBody Department department)
    {
        return m_departmentService.create(department);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id)
    {
        m_departmentService.delete(id);
    }
}
