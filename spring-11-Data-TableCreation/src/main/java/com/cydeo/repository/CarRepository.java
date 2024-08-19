package com.cydeo.repository;

import com.cydeo.entitity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
