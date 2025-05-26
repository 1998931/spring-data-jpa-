package com.ganesh.mappingdemo.service;

import com.ganesh.mappingdemo.entity.Product;
import com.ganesh.mappingdemo.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public String saveProduct(Product product) {
        productRepository.save(product);
        return "Product saved successfully";
    }
}
