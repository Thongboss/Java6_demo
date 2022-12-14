package com.example.demo_java6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_java6.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
