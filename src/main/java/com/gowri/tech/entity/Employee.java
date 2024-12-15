package com.gowri.tech.entity;

import jakarta.persistence.*;

import java.util.Objects;

/*
 * @author NaveenWodeyar
 * @date 15-12-2024
 */
@Entity
@Table(name = "Employee_Table")
public class Employee {

    @EmbeddedId
    private EmployeePKId employeePKId;

    private String empName;

    private String empMail;

    private String empPhone;

    public Employee() {
    }

    public Employee(EmployeePKId employeePKId, String empName, String empMail, String empPhone) {
        this.employeePKId = employeePKId;
        this.empName = empName;
        this.empMail = empMail;
        this.empPhone = empPhone;
    }

    public EmployeePKId getEmployeePKId() {
        return employeePKId;
    }

    public void setEmployeePKId(EmployeePKId employeePKId) {
        this.employeePKId = employeePKId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpMail() {
        return empMail;
    }

    public void setEmpMail(String empMail) {
        this.empMail = empMail;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(employeePKId, employee.employeePKId) && Objects.equals(getEmpName(), employee.getEmpName()) && Objects.equals(getEmpMail(), employee.getEmpMail()) && Objects.equals(getEmpPhone(), employee.getEmpPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeePKId, getEmpName(), getEmpMail(), getEmpPhone());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeePKId=" + employeePKId +
                ", empName='" + empName + '\'' +
                ", empMail='" + empMail + '\'' +
                ", empPhone='" + empPhone + '\'' +
                '}';
    }
}
