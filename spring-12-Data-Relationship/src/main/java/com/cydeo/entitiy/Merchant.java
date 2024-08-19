package com.cydeo.entitiy;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "merchants")
@NoArgsConstructor
@Data
public class Merchant {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     private String name;

     private String code;

     private BigDecimal transactionFee;

     private Integer payoutDelayCount;


     @OneToMany(mappedBy = "merchant")
     private List<Payment> payments;

    public Merchant(String name, String code, BigDecimal transactionFee, Integer payoutDelayCount) {
        this.name = name;
        this.code = code;
        this.transactionFee = transactionFee;
        this.payoutDelayCount = payoutDelayCount;
    }
}
