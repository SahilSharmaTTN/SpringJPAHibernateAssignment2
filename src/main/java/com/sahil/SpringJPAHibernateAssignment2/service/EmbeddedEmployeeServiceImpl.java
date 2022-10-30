package com.sahil.SpringJPAHibernateAssignment2.service;

import com.sahil.SpringJPAHibernateAssignment2.entities.EmbeddedEmployee;
import com.sahil.SpringJPAHibernateAssignment2.repository.EmbeddedEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmbeddedEmployeeServiceImpl implements EmbeddedEmployeeService{

    @Autowired
    EmbeddedEmployeeRepository embeddedEmployeeRepository;

    @Override
    public EmbeddedEmployee createEmbeddedEmployee(EmbeddedEmployee employee) {
        return embeddedEmployeeRepository.save(employee);
    }
}
