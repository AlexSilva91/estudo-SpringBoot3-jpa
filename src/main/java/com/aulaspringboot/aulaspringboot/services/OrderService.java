package com.aulaspringboot.aulaspringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulaspringboot.aulaspringboot.entities.Order;
import com.aulaspringboot.aulaspringboot.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return this.repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = this.repository.findById(id);
		return obj.get();
	}
}
