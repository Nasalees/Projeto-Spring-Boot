package com.projetoSpring.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.userdept.entities.User;

public interface UserReposity extends JpaRepository<User, Long>{
	
}
