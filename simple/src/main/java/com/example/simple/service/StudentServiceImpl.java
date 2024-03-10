package com.example.simple.service;
import com.example.simple.Repository.StudentRepository;
import com.example.simple.models.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
@Autowired
    StudentRepository studentRepository;
    @Override
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        Optional<Student> student= studentRepository.findById(id);
        if(student.isPresent()){return student.get();}
        throw new RuntimeException("not found id"+id);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }

}
