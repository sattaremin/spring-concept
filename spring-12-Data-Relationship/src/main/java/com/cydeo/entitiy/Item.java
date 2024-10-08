package com.cydeo.entitiy;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "items")
public class Item {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    private String code;

    @ManyToMany(mappedBy = "items")
    private List<Card> card;

    public Item(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
