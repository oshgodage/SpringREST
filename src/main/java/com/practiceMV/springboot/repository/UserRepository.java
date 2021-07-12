package com.practiceMV.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.practiceMV.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	List<User> findByFirstName(@Param("firstName") String firstName);
}
