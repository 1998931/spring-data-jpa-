package com.ganesh.mappingdemo.controller;

import com.ganesh.mappingdemo.entity.Student;
import com.ganesh.mappingdemo.service.StudnetService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudnetService studnetService;
    public StudentController(StudnetService studnetService) {
        this.studnetService = studnetService;
    }

    @PostMapping
    String saveStudent(@RequestBody Student student) {
        return studnetService.saveStudent(student);
    }

}
