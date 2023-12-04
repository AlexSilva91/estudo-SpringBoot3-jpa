package com.aulaspringboot.aulaspringboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulaspringboot.aulaspringboot.entities.User;
import com.aulaspringboot.aulaspringboot.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return this.repository.findAll();
	}

	public User findByID(Long id) {
		Optional<User> obj = this.repository.findById(id);
		return obj.get();
	}
}
