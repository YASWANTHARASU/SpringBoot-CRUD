package com.example.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
 public Student(int rollno, String name, int mark, String department) {
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
		this.department = department;
	}
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int rollno;
 @Column(name="NAME")
 private String name;
 @Column(name="MARK")
 private int mark;
 @Column(name="DEPT")
 private String department;
 public Student(){ 
	 
 }
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMark() {
	return mark;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + ", mark=" + mark + ", department=" + department + "]";
}
public void setMark(int mark) {
	this.mark = mark;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
}
