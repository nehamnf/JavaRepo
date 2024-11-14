package com.myspringboot.apicruddemo.rest;

import com.myspringboot.apicruddemo.dao.EmployeeDAO;
import com.myspringboot.apicruddemo.entity.Employee;
import com.myspringboot.apicruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId){
        Employee employee= employeeService.findById(employeeId);
        if(employee == null){
            throw new RuntimeException("Employee not found: "+employeeId);
        }
        return employeeService.findById(employeeId);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        Employee employee1=employeeService.save(employee);
        return employee1;
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        Employee employee1=employeeService.save(employee);
        return employee1;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee employee=employeeService.findById(employeeId);
        if(employee == null){
            throw new RuntimeException("Employee ID not found: "+employeeId);
        }

        employeeService.deleteById(employeeId);
        return "Deleted Employee ID: "+employeeId;
    }


}
