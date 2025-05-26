package com.ganesh.mappingdemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    private int id;
    private String name;
    private String about;

@OneToOne (mappedBy = "student",cascade = CascadeType.ALL)
private Laptop laptop;

@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)

private List<Address> addresses=new ArrayList<>();

}
