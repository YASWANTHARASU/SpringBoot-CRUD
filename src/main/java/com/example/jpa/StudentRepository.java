package com.example.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.jpa.entity.Student;

public interface StudentRepository  extends CrudRepository<Student, Integer>{

}
