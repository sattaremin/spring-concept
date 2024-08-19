package com.cydeo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@Table(name = "location")
public class Location extends BaseEntity{

    private String name;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private String postalCode;

    private String country;

    private String state;

    private String city;

    private String address;



}
