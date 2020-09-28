package com.works.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.works.projeto.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
