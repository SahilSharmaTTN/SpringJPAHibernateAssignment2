package com.sahil.SpringJPAHibernateAssignment2.service;

import com.sahil.SpringJPAHibernateAssignment2.entities.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee createEmployee(Employee employee);

    public Iterable<Employee> getAllEmployees();

    public List<Object[]> getAllEmployeesPartial();

    public List<Object[]>  getDataForJPQLQuery1();


    public double getAvgSal();
    public int getDataForJPQLQuery2(double salary);


    public double getMinSal();

    public int getDataForJPQLQuery3();

    public List<Object[]> getDataForNQ1();

    public int getDataForNQ2(int age);
}
