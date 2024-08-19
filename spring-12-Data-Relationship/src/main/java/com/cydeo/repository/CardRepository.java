package com.cydeo.repository;

import com.cydeo.entitiy.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Long> {
}
