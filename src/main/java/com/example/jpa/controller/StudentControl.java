package com.example.jpa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.StudentRepository;
import com.example.jpa.entity.Student;

@RestController
public class StudentControl{
	@Autowired
	StudentRepository repo;
 @GetMapping("/students")
 public List<Student> getAllStudents(){
	 List<Student> students = new ArrayList();
	    repo.findAll().forEach(students::add);
	    return students;
 }
 @GetMapping("/students/{rollno}")
 public Student getStudent(@PathVariable int rollno)
 {
	 Student stu=repo.findById(rollno).get();
	 return stu;
 }
 @PostMapping("/students/add")
 @ResponseStatus(code=HttpStatus.CREATED)
 public void creteStudent(@RequestBody Student stu) {
	 repo.save(stu);
	 
 } 
 @PutMapping("/students/update/{rollno}")
 public Student updateStudent(@PathVariable int rollno) {
	 Student stu=repo.findById(rollno).get();
	 stu.setName("Rajesh");
	 stu.setDepartment("civil");
	 repo.save(stu);
	 return stu;
	 
	 
 } 
 @DeleteMapping("/students/delete/{rollno}")
 public Student deleteStudent(@PathVariable int rollno) {
	 Student stu=repo.findById(rollno).get();
	 repo.delete(stu);
	 return stu;
 }
	 
}
