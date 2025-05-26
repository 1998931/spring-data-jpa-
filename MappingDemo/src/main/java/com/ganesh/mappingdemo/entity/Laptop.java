package com.ganesh.mappingdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Laptop {
    @Id
    private int id;
    private String modelNumber;
    private String brand;

@OneToOne
@JoinColumn(name="studentId")

private Student student;

}
