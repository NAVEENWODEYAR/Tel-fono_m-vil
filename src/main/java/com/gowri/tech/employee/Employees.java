package com.gowri.tech.employee;

import java.util.Objects;

/*
 * @author NaveenWodeyar
 * @date 08-01-2025
 */
public class Employees {

    private static int idCounter = 100;
    
    private Integer empId;
    private String empName;
    private Integer empAge;
    private String empGender;
    private String empDepartment;
    private Integer empYearOfJoining;
    private Double empSalary;

    // Default constructor
    public Employees() {}

    // Modified constructor to automatically generate empId
    public Employees(String empName, Integer empAge, String empGender, String empDepartment, Integer empYearOfJoining, Double empSalary) {
        this.empId = idCounter++; // Automatically assign and increment empId
        this.empName = empName;
        this.empAge = empAge;
        this.empGender = empGender;
        this.empDepartment = empDepartment;
        this.empYearOfJoining = empYearOfJoining;
        this.empSalary = empSalary;
    }

    // Getters and Setters
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpAge() {
        return empAge;
    }

    public void setEmpAge(Integer empAge) {
        this.empAge = empAge;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    public Integer getEmpYearOfJoining() {
        return empYearOfJoining;
    }

    public void setEmpYearOfJoining(Integer empYearOfJoining) {
        this.empYearOfJoining = empYearOfJoining;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    // Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees employees)) return false;
        return Objects.equals(getEmpId(), employees.getEmpId()) && Objects.equals(getEmpName(), employees.getEmpName()) && Objects.equals(getEmpAge(), employees.getEmpAge()) && Objects.equals(getEmpGender(), employees.getEmpGender()) && Objects.equals(getEmpDepartment(), employees.getEmpDepartment()) && Objects.equals(getEmpYearOfJoining(), employees.getEmpYearOfJoining()) && Objects.equals(getEmpSalary(), employees.getEmpSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(), getEmpName(), getEmpAge(), getEmpGender(), getEmpDepartment(), getEmpYearOfJoining(), getEmpSalary());
    }

    // To string method
    @Override
    public String toString() {
        return "Employees{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empGender='" + empGender + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                ", empYearOfJoining=" + empYearOfJoining +
                ", empSalary=" + empSalary +
                '}';
    }
}
