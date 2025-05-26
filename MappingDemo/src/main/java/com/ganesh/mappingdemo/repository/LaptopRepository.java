package com.ganesh.mappingdemo.repository;

import com.ganesh.mappingdemo.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
