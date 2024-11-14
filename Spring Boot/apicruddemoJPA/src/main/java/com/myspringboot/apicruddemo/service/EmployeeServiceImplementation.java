package com.myspringboot.apicruddemo.service;

import com.myspringboot.apicruddemo.dao.EmployeeRepository;
import com.myspringboot.apicruddemo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

    private EmployeeRepository employeeRepositorye;

    @Autowired
    public EmployeeServiceImplementation(EmployeeRepository employeeDAO) {
        this.employeeRepositorye = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepositorye.findAll();
    }

    @Override
    public Employee findById(int empId){
        Optional<Employee> employee= employeeRepositorye.findById(empId);
        Employee theEmployee=null;
        if(employee.isPresent()){
            theEmployee=employee.get();
        }else {
            throw new RuntimeException("Employee not found "+empId);
        }
        return theEmployee;
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeeRepositorye.save(employee);
    }

    @Transactional
    @Override
    public void deleteById(int empId) {
        employeeRepositorye.deleteById(empId);
    }
}
