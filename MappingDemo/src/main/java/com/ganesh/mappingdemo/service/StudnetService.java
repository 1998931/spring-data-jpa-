package com.ganesh.mappingdemo.service;

import com.ganesh.mappingdemo.entity.Laptop;
import com.ganesh.mappingdemo.entity.Student;
import com.ganesh.mappingdemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

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

}
