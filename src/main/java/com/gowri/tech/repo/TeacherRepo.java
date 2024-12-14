package com.gowri.tech.repo;
/*
 * @author NaveenWodeyar
 * @date 15-12-2024
 */

import com.gowri.tech.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,String> {
}
