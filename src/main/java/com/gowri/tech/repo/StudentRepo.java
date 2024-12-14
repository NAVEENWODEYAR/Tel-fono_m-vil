package com.gowri.tech.repo;
/*
 * @author NaveenWodeyar
 * @date 14-12-2024
 */

import com.gowri.tech.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,String > {
}
