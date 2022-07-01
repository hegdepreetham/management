package com.javaguides.studentmanagementsystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javaguides.studentmanagementsystem.entity.Student;


public interface StudentService {

	 List<Student> getAllStudents();

	Student saveStudent(Student student);
	
	Student getStudentByid(Long id);
	
	Student  updateStudent(Student student);
}
