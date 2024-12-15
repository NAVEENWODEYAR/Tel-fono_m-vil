package com.gowri.tech.service;
/*
 * @author NaveenWodeyar
 * @date 15-12-2024
 */

import com.gowri.tech.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getEmployeeList();
}
