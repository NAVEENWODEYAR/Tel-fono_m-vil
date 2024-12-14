package com.gowri.tech.service;
/*
 * @author NaveenWodeyar
 * @date 14-12-2024
 */

import com.gowri.tech.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    Student save(Student student);

    List<Student> getStudentList();
}
