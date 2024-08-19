package com.cydeo.entitiy;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "card_item_rel",
    joinColumns = @JoinColumn(name = "c_id"),
            inverseJoinColumns = @JoinColumn(name = "i_id"))
    private List<Item> items;

    public Card(Long id, List<Item> items) {
        this.id = id;
        this.items = items;
    }
}
