package com.javaguides.studentmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguides.studentmanagementsystem.entity.Student;

public interface StudentDAO extends JpaRepository<Student, Long> {

}
