package com.Product.caresale.service;

import com.Product.caresale.model.Employee;
import com.Product.caresale.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

}
