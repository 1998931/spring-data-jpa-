package com.ganesh.mappingdemo.repository;

import com.ganesh.mappingdemo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
