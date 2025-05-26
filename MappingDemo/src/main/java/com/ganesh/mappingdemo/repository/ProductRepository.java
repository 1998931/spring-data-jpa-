package com.ganesh.mappingdemo.repository;

import com.ganesh.mappingdemo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
