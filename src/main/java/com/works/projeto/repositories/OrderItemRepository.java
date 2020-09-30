package com.works.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.works.projeto.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
