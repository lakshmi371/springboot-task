package com.springboot.Product.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Optional<Product> findById(long id);

}