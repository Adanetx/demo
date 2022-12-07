package com.example.demo.service;

import com.example.demo.domain.Student;

import java.util.List;

public interface Service {
    public List<Student> getAllStudents();
    public Student addStudent(Student student);
    public  Student getSingleStudent(long  id);
    public  Student deleteStudent(long id);
    public Student updateStudent(long id, Student student);
}
