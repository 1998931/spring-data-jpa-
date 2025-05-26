package com.ganesh.mappingdemo.controller;

import com.ganesh.mappingdemo.entity.Product;
import com.ganesh.mappingdemo.entity.Student;
import com.ganesh.mappingdemo.service.ProductService;
import com.ganesh.mappingdemo.service.StudnetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudnetService studnetService;
    private final ProductService productService;

    public StudentController(StudnetService studnetService, ProductService productService) {
        this.studnetService = studnetService;
        this.productService = productService;
    }

    @PostMapping
    String saveStudent(@RequestBody Student student) {

        return studnetService.saveStudent(student);
    }

@PostMapping("/product")
    public String saveProduct(@RequestBody Product product) {

        return productService.saveProduct(product);
    }

    @GetMapping("/{id}")
public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
    Student student = studnetService.getStudentById(id.intValue());
    return ResponseEntity.ok(student);
}
    @GetMapping("/name/{name}")
    public ResponseEntity<?> getStudentByName(@PathVariable String name) {
        return ResponseEntity.ok(studnetService.studentName(name));

    }

}
