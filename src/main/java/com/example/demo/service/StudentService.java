package com.example.demo.service;

import com.example.demo.domain.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class StudentService implements Service{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    @Override
    public Student addStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    @Override
    public Student getSingleStudent(long id) {
        Student student = studentRepository.findById(id).orElseThrow(() ->{
        return new RuntimeException("there is no data");
        });
        return student;
    }

    @Override
    public Student deleteStudent(long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("there is no student "));
        studentRepository.deleteById(id);
        return student;
    }

    @Override
    public Student updateStudent(long id, Student student) {
        Student result = studentRepository.findById(id).orElseThrow(()-> new RuntimeException("there is not student"));
        result.setAge(student.getAge());
        result.setFirstName(student.getFirstName());
        result.setLastName(student.getLastName());
        result.setSex(student.getSex());
        studentRepository.save(result);
        return  result;
    }
}
