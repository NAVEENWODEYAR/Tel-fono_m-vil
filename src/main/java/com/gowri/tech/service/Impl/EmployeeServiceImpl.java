package com.gowri.tech.service.Impl;
/*
 * @author NaveenWodeyar
 * @date 15-12-2024
 */

import com.gowri.tech.entity.Employee;
import com.gowri.tech.repo.EmployeeRepo;
import com.gowri.tech.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getEmployeeList() {
        return employeeRepo.findAll();
    }
}
