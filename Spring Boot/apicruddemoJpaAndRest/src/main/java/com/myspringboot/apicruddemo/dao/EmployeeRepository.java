package com.myspringboot.apicruddemo.dao;

import com.myspringboot.apicruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
