package com.cydeo.entitity;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
public class CreditAccount extends Account{


    private BigDecimal creditLimit;



}
