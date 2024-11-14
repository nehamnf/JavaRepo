package com.myspringboot.apicruddemo.dao;

import com.myspringboot.apicruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int empId);

    Employee save(Employee employee);

    void deleteById(int empId);




}
