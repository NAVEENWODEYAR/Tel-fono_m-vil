package com.gowri.tech.controller;
/*
 * @author NaveenWodeyar
 * @date 15-12-2024
 */

import com.gowri.tech.entity.Employee;
import com.gowri.tech.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/emp")
public class EmployeeController {
    private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String testEmployee(){
        return "EMPLOYEE_CONTROLLER";
    }

    @PostMapping("/add")
    public Employee saveEmployee(@RequestBody Employee request){
        return employeeService.saveEmployee(request);
    }

    @GetMapping("/list")
    public List<Employee> employeeList(){
        return employeeService.getEmployeeList();
    }
}
