package com.myspringboot.apicruddemo.dao;

import com.myspringboot.apicruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> typedQuery=entityManager.createQuery("FROM Employee",Employee.class);
        List<Employee> employees=typedQuery.getResultList();
        return employees;
    }

    @Override
    public Employee findById(int empId) {
        Employee employee=entityManager.find(Employee.class,empId);
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        Employee employee1=entityManager.merge(employee);
        return employee1;
    }

    @Override
    public void deleteById(int empId) {
        Employee employee=entityManager.find(Employee.class,empId);
        entityManager.remove(employee);
    }
}
