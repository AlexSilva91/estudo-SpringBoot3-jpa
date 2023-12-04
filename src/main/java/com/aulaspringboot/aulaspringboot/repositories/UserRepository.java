package com.aulaspringboot.aulaspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspringboot.aulaspringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
