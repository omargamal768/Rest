package com.example.simple.service;

import com.example.simple.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudent();
    Student getStudentById(Long id);

Student saveStudent(Student student);
Student updateStudent(Student student);
void deleteStudent(Long id);

}
