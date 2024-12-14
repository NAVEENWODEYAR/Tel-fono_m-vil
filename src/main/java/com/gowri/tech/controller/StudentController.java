package com.gowri.tech.controller;
/*
 * @author NaveenWodeyar
 * @date 05-12-2024
 */

import com.gowri.tech.entity.Student;
import com.gowri.tech.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class StudentController {
    private static final Logger log = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<?> test(){
        return ResponseEntity.ok("CONNECTED");
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student request){
        log.info("Saving student");
        return studentService.save(request);
    }

    @GetMapping("/list")
    public List<Student> getStudentList(){
        log.info("Student List");
        return studentService.getStudentList();
    }
}
