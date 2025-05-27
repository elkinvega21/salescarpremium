package com.unac.salescarpremium.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unac.salescarpremium.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
