package com.example.demo.controller;

import com.example.demo.domain.Student;
import com.example.demo.service.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private Service service;

    public StudentController(Service service) {
        this.service = service;
    }
    @GetMapping("/students")
    public ResponseEntity<Student> getAllStudents(){
        List<Student> students = service.getAllStudents();
        return new ResponseEntity(students, HttpStatus.OK);
    }
    @PostMapping("/students")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
     Student student1 = service.addStudent(student);
      return  new ResponseEntity(student1, HttpStatus.CREATED);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudent( @PathVariable long id){
        Student student = service.getSingleStudent(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @DeleteMapping("/students/{id}")
    public  ResponseEntity<Student> deleteStudent(@PathVariable long id){
        Student student = service.deleteStudent(id);
        return new ResponseEntity<>(student, HttpStatus.NO_CONTENT);
    }
    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable long id, @RequestBody Student student){
    Student student1 = service.updateStudent(id, student);
    return  new ResponseEntity<>(student1, HttpStatus.OK);
    }
}
