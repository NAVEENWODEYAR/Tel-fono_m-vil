package com.gowri.tech.repo;
/*
 * @author NaveenWodeyar
 * @date 15-12-2024
 */

import com.gowri.tech.entity.Employee;
import com.gowri.tech.entity.EmployeePKId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, EmployeePKId> {
}
