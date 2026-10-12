package com.leonardoalves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardoalves.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
