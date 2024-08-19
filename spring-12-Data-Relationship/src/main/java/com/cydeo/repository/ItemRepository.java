package com.cydeo.repository;

import com.cydeo.entitiy.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
