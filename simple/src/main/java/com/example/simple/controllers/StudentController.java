package com.example.simple.controllers;

import com.example.simple.models.Student;
import com.example.simple.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
@GetMapping("/students")
    public List<Student> readStudents(){
        return studentService.getStudent() ;
    }


    @GetMapping("/students/{id}")
    public Student readStudentById(@PathVariable("id") Long id){
        return studentService.getStudentById(id);
    }


    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
    return studentService.saveStudent(student);
    }



    @DeleteMapping("/students")
    public  void deleteStudent(@RequestParam("id") Long id){
         studentService.deleteStudent(id);
    }


    @PutMapping("/students/{id}")
    public Student updateStudentById(@PathVariable("id") Long id , @RequestBody Student student){
        student.setId(id);
        return studentService.updateStudent(student);
    }

}
