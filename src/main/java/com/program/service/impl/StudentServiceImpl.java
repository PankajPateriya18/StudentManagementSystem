package com.program.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.program.entity.Student;
import com.program.repository.StudentRepository;
import com.program.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
		
	}
	
	@Override
	public Student getStudentById(Long id) {
	    Student st = studentRepository.findById(id).get();
		return st;
	}
	
	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	
	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}
}
