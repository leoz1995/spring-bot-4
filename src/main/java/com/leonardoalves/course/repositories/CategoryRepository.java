package com.leonardoalves.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardoalves.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
