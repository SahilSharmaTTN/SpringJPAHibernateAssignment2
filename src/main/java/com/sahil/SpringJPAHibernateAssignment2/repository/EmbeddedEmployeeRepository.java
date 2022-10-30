package com.sahil.SpringJPAHibernateAssignment2.repository;

import com.sahil.SpringJPAHibernateAssignment2.entities.EmbeddedEmployee;
import org.springframework.data.repository.CrudRepository;

public interface EmbeddedEmployeeRepository extends CrudRepository<EmbeddedEmployee,Integer> {

}
