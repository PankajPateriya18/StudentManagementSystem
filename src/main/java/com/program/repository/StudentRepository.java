package com.program.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.program.entity.Student;

 
public interface StudentRepository extends JpaRepository<Student, Long>{

}
