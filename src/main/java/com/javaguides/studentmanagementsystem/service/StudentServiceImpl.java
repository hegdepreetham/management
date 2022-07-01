package com.javaguides.studentmanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaguides.studentmanagementsystem.dao.StudentDAO;
import com.javaguides.studentmanagementsystem.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
        @Autowired
		StudentDAO dao;
	    
	
		
		@Override
		public List<Student> getAllStudents() {
			return dao.findAll();
		}



		@Override
		public Student saveStudent(Student student) {
			// TODO Auto-generated method stub
			return dao.save(student);
		}



		public Student getStudentByid(Long id) {
			// TODO Auto-generated method stub
			return dao.findById(id).get();
		}



		public Student updateStudent(Student student) {
			// TODO Auto-generated method stub
			return dao.save(student);
		}

	

}
