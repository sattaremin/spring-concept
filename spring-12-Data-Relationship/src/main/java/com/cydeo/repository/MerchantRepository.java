package com.cydeo.repository;

import com.cydeo.entitiy.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant,Long> {
}
