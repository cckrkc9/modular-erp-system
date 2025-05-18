package com.erpproject.humanresources.service;

import com.erpproject.humanresources.entity.Department;
import com.erpproject.humanresources.repository.IDepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final IDepartmentRepository m_departmentRepository;

    public DepartmentService(IDepartmentRepository departmentRepository)
    {
        m_departmentRepository = departmentRepository;
    }

    public List<Department> getAll()
    {
        return m_departmentRepository.findAll();
    }

    public Department getById(Long id)
    {
        return m_departmentRepository.findById(id).orElseThrow();
    }

    public Department create(Department department)
    {
        return m_departmentRepository.save(department);
    }

    public void delete(Long id)
    {
        m_departmentRepository.deleteById(id);
    }
}
