package com.gowri.tech.entity;
/*
 * @author NaveenWodeyar
 * @date 14-12-2024
 */

import com.gowri.tech.utils.StudentIdGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

import java.util.Objects;

@Entity
@Table(name = "Student_Table")
public class Student {

    @Id
    @GeneratedValue(generator = "Student_Id")
    @GenericGenerator(name = "Student_ID",type = StudentIdGenerator.class)
    private String stId;

    private String  stName;

    private String stClass;

    private String stMail;

    private String stGender;

    private String stMobile;

    public Student() {
    }

    public Student(String stId, String stName, String stClass, String stMail, String stGender, String stMobile) {
        this.stId = stId;
        this.stName = stName;
        this.stClass = stClass;
        this.stMail = stMail;
        this.stGender = stGender;
        this.stMobile = stMobile;
    }

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStClass() {
        return stClass;
    }

    public void setStClass(String stClass) {
        this.stClass = stClass;
    }

    public String getStMail() {
        return stMail;
    }

    public void setStMail(String stMail) {
        this.stMail = stMail;
    }

    public String getStGender() {
        return stGender;
    }

    public void setStGender(String stGender) {
        this.stGender = stGender;
    }

    public String getStMobile() {
        return stMobile;
    }

    public void setStMobile(String stMobile) {
        this.stMobile = stMobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(getStId(), student.getStId()) && Objects.equals(getStName(), student.getStName()) && Objects.equals(getStClass(), student.getStClass()) && Objects.equals(getStMail(), student.getStMail()) && Objects.equals(getStGender(), student.getStGender()) && Objects.equals(getStMobile(), student.getStMobile());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStId(), getStName(), getStClass(), getStMail(), getStGender(), getStMobile());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stId='" + stId + '\'' +
                ", stName='" + stName + '\'' +
                ", stClass='" + stClass + '\'' +
                ", stMail='" + stMail + '\'' +
                ", stGender='" + stGender + '\'' +
                ", stMobile='" + stMobile + '\'' +
                '}';
    }
}
