package com.sahil.SpringJPAHibernateAssignment2.service;

import com.sahil.SpringJPAHibernateAssignment2.entities.Employee;
import com.sahil.SpringJPAHibernateAssignment2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Object[]> getAllEmployeesPartial() {
        return employeeRepository.getAllEmps();
    }

    @Override
    public List<Object[]> getDataForJPQLQuery1() {
        return employeeRepository.JPQLQuery1();
    }

    @Override
    public double getAvgSal() {
        return employeeRepository.getAvgSal();
    }

    @Override
    @Transactional
    public int getDataForJPQLQuery2(double salary) {

        double avg  = employeeRepository.getAvgSal();

        int result = employeeRepository.JPQLQuery2(salary,avg);

//        int result = employeeRepository.nativeQuery0(salary);
        System.out.println(result + "rows affected");
        return result;
    }

    @Override
    public double getMinSal() {
        return employeeRepository.getMinSal();
    }

    @Transactional
    @Override
    public int getDataForJPQLQuery3() {
        double minSalary = employeeRepository.getMinSal();
        return employeeRepository.JPQLQuery3(minSalary);
    }

    @Override
    public List<Object[]> getDataForNQ1() {
        return employeeRepository.nativeQuery1();
    }

    @Override
    @Transactional
    public int getDataForNQ2(int age) {
        return employeeRepository.nativeQuery2(age);
    }
}
