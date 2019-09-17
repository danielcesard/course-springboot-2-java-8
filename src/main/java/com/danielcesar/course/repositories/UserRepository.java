package com.danielcesar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielcesar.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
