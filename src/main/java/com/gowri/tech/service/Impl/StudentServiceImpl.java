package com.gowri.tech.service.Impl;
/*
 * @author NaveenWodeyar
 * @date 14-12-2024
 */

import com.gowri.tech.entity.Student;
import com.gowri.tech.repo.StudentRepo;
import com.gowri.tech.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student save(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getStudentList() {
        return studentRepo.findAll();
    }
}
