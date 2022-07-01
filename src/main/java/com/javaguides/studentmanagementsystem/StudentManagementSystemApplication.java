package com.javaguides.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javaguides.studentmanagementsystem.dao.StudentDAO;
import com.javaguides.studentmanagementsystem.entity.Student;

@SpringBootApplication
public class StudentManagementSystemApplication {

	
	@Autowired
	StudentDAO dao;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	//@Override
	//public void run(String... args) throws Exception {
		
//		Student s1=new Student("Aditya","M S","msadityams@gmail.com");
//		dao.save(s1);
//		Student s2=new Student("kiran","Dalwai","kirandalwai@gmail.com");
//		dao.save(s2);
//		Student s3=new Student("phaneesh","MNH","phaneeshmnh@gmail.com");
//		dao.save(s3);
	//}

}
