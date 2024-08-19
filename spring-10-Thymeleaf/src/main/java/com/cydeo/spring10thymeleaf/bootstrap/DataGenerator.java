package com.cydeo.spring10thymeleaf.bootstrap;

import com.cydeo.spring10thymeleaf.model.Student;
import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {


    public static List<Student> createStudent(){
        List<Student> students = Arrays.asList(
                new Student(new Faker().name().firstName(),
                        new Faker().name().lastName(),new Faker().number().numberBetween(1,80),
                        new Faker().address().state()),
                new Student(new Faker().name().firstName(),
                        new Faker().name().lastName(),new Faker().number().numberBetween(1,80),
                        new Faker().address().state()),
                new Student(new Faker().name().firstName(),
                        new Faker().name().lastName(),new Faker().number().numberBetween(1,80),
                        new Faker().address().state()),
                new Student(new Faker().name().firstName(),
                        new Faker().name().lastName(),new Faker().number().numberBetween(1,80),
                        new Faker().address().state())
                );

        return students;
    }

}
