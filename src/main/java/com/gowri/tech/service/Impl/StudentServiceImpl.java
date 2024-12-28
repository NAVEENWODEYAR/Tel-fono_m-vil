package com.gowri.tech.service.Impl;
/*
 * @author NaveenWodeyar
 * @date 14-12-2024
 */

import com.gowri.tech.entity.Student;
import com.gowri.tech.repo.StudentRepo;
import com.gowri.tech.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    @Override
    public Student updateStudent(Student student, String studentName) {
            Student existingStudent = studentRepo.findByStName(studentName);
            BeanUtils.copyProperties(student,existingStudent);
            return existingStudent;
        }


    @Override
    public String delete(String studentName) {
        studentRepo.deleteById(studentName);
        return "Student " + studentName + "deleted successfully";
    }

    @Override
    public Student getStudentById(String id) {
        return studentRepo.findById(id).get();
    }
}
