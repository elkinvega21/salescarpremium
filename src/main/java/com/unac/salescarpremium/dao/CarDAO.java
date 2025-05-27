package com.unac.salescarpremium.dao;

import com.unac.salescarpremium.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDAO extends JpaRepository<Car, Long> {
}
