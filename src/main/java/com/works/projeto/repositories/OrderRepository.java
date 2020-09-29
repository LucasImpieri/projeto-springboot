package com.works.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.works.projeto.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
