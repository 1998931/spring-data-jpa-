package com.ganesh.mappingdemo.repository;

import com.ganesh.mappingdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("select s from Student s where s.name like %:name%")
    List<Student> findByNameContaining(String name);

}
