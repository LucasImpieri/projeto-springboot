package com.works.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.works.projeto.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
