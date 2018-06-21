package com.travel.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travel.backend.entities.user.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
