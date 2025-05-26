package com.ganesh.mappingdemo.service;

import com.ganesh.mappingdemo.entity.Laptop;
import com.ganesh.mappingdemo.entity.Student;
import com.ganesh.mappingdemo.exception.UserNotFound;
import com.ganesh.mappingdemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudnetService {
    private final StudentRepository studentRepository;
    public StudnetService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public String saveStudent(Student student) {

        studentRepository.save(student);
        return "Student saved successfully";
    }

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElseThrow(()-> new UserNotFound("User not found with id: " + id));
    }

    public List<Student> studentName(String name) {
        return studentRepository.findByNameContaining(name);
    }
}
