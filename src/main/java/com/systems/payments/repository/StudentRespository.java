package com.systems.payments.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.systems.payments.entity.Student;

public interface StudentRespository extends JpaRepository<Student, String>{
    Student findByCode(String code);

    List<Student> findByProgramId(String programId);

}
