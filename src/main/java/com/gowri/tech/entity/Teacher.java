package com.gowri.tech.entity;
/*
 * @author NaveenWodeyar
 * @date 15-12-2024
 */

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@Entity
@Table(name = "Teacher_Table")
public class Teacher {

    @Id
    @GeneratedValue(generator ="teacher_sequence",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "teacher_sequence",sequenceName = "teacher_sequence",initialValue = 10,allocationSize = 10)
    private String teacherId;

    @NotNull(message = "Teacher_Name can't be empty")
    @Size(min = 5,max = 50,message = "Should be between 2-50 characters")
    private String teacherName;

    @NotNull(message = "Teacher_Mail can't be empty")
    @Size(min = 5,max = 50,message = "Should be between 2-50 characters")
    private String teacherMail;

    @NotNull(message = "Phone_No can't be empty")
    @Size(min = 5,max = 50,message = "Should be between 2-50 characters")
    private String teacherPhone;

    public Teacher(){}

    public Teacher(String teacherId, String teacherName, String teacherMail, String teacherPhone) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherMail = teacherMail;
        this.teacherPhone = teacherPhone;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherMail() {
        return teacherMail;
    }

    public void setTeacherMail(String teacherMail) {
        this.teacherMail = teacherMail;
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher teacher)) return false;
        return Objects.equals(getTeacherId(), teacher.getTeacherId()) && Objects.equals(getTeacherName(), teacher.getTeacherName()) && Objects.equals(getTeacherMail(), teacher.getTeacherMail()) && Objects.equals(getTeacherPhone(), teacher.getTeacherPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTeacherId(), getTeacherName(), getTeacherMail(), getTeacherPhone());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherMail='" + teacherMail + '\'' +
                ", teacherPhone='" + teacherPhone + '\'' +
                '}';
    }
}
