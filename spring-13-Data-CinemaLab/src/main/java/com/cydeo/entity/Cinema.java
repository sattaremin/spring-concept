package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "cinema")
public class Cinema extends BaseEntity{


    private String name;

    private String sponsoredName;

    @ManyToOne(fetch = FetchType.LAZY)
    private Location location;





}
