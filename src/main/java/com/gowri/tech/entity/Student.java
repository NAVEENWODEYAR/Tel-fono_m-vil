package com.gowri.tech.entity;
/*
 * @author NaveenWodeyar
 * @date 14-12-2024
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gowri.tech.utils.StudentIdGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.GenericGenerator;

import java.util.Objects;

@Entity
@Table(name = "Student_Table")
public class Student {

    @Id
    @GeneratedValue(generator = "student-id-generator")
    @GenericGenerator(name = "student-id-generator",type = StudentIdGenerator.class)
    private String stId;

    @NotNull(message = "Name can't be empty")
    @Size(min = 5,max = 50,message = "Should be between 2-50 characters")
    @JsonProperty("STUDENT_NAME")
    private String  stName;

    @NotNull(message = "Class can't be empty")
    @Size(min = 5,max = 50,message = "Should be between 2-50 characters")
    @JsonProperty("STUDENT_CLASS")
    private String stClass;

    @NotNull(message = "Mail can't be empty")
    @Size(min = 5,max = 50,message = "Should be between 2-50 characters")
    @JsonProperty("STUDENT_MAIL")
    private String stMail;

    @NotNull(message = "Gender can't be empty")
    @Size(min = 5,max = 50,message = "Should be between 2-50 characters")
    @JsonProperty("STUDENT_GENDER")
    private String stGender;

    @NotNull(message = "Mobile_No can't be empty")
    @Size(min = 5,max = 50,message = "Should be between 2-50 characters")
    @JsonProperty("STUDENT_MOBILE")
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
