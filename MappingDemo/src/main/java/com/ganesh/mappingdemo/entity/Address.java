package com.ganesh.mappingdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
    @Id
    private int id;

    private String street;
    private String city;
    private String country;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
