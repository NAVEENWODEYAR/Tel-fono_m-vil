package com.gowri.tech.entity;
/*
 * @author NaveenWodeyar
 * @date 15-12-2024
 */

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EmployeePKId implements Serializable {

    private String empId;
    private String deptId;

    public EmployeePKId(){}
    public EmployeePKId(String empId, String deptId) {
        this.empId = empId;
        this.deptId = deptId;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeePKId that)) return false;
        return Objects.equals(getEmpId(), that.getEmpId()) && Objects.equals(getDeptId(), that.getDeptId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmpId(), getDeptId());
    }

    @Override
    public String toString() {
        return "EmployeePKId{" +
                "empId='" + empId + '\'' +
                ", deptId='" + deptId + '\'' +
                '}';
    }
}
