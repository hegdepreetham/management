package com.javaguides.studentmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.javaguides.studentmanagementsystem.entity.Student;
import com.javaguides.studentmanagementsystem.service.StudentService;

@Controller
public class StudentController {
     @Autowired
	private StudentService service;


       @GetMapping("/students")
	   public String listStudents(Model model) {
    	   model.addAttribute("students", service.getAllStudents());
    	   return "students";
       }
       @GetMapping("/students/new")
       public String createstudentForm(Model model) {
    	   
    	   Student student=new Student();
    	   model.addAttribute("student",student);
    	   return "CreateStudent";
       }
       
       @PostMapping("/stud")
       public String saveStudent(@ModelAttribute("student") Student student) {
    	  service.saveStudent(student);
    	  return "redirect:/students";
       }
       
       @GetMapping("/students/edit/{id}")
       public String updateStudent(@PathVariable("id") Long id,Model model) {
    	   model.addAttribute("student",service.getStudentByid(id));
		return "edit_student";   
       }
       
       @PostMapping("/students/{id}")
       public String update(@PathVariable("id") long id, @ModelAttribute("student") Student student,Model model) {
    	   Student s= service.getStudentByid(id);
    	   s.setId(id);
    	   s.setFirstname(student.getFirstname());
    	   s.setLastname(student.getLastname());
    	   s.setEmail(student.getEmail());
    	   service.updateStudent(s);
    	   
		return "redirect:/students";
    	   
       }
}
