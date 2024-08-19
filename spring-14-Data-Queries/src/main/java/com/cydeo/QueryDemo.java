package com.cydeo;

import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;

public class QueryDemo implements CommandLineRunner {

    private final RegionRepository regionRepository;

    public QueryDemo(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("findByCountry: "+regionRepository.findByCountry("canada"));

        System.out.println("findByCountry: "+regionRepository.findByCountryContaining("united"));

        System.out.println("findByCountry: "+regionRepository.findByCountryContainingOrderByRegion("united"));

        System.out.println("findByCountry: "+regionRepository.findTopByCountry("United States"));

    }
}
