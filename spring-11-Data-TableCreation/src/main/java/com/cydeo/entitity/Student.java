package com.cydeo.entitity;


import com.cydeo.enums.Gender;
import jakarta.persistence.*;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
@Table(name = "students")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String email;



    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;
    @Column(columnDefinition = "TIME")
    private LocalDate birthTime;
    @Column(columnDefinition = "DATE")
    private LocalDate birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Transient
    private String city;

}
