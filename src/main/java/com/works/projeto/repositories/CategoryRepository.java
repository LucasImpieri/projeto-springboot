package com.works.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.works.projeto.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
