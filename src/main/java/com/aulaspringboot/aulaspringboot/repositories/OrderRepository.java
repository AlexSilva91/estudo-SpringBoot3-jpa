package com.aulaspringboot.aulaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspringboot.aulaspringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
