package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Integer> {

    //display all the regions in canada


    List<Region> findByCountry(String country);

    //display all the countries that includes "united"

    List<Region> findByCountryContaining(String country);

    List<Region> findByCountryContainingOrderByRegion(String country);

    List<Region> findTopByCountry(String Country);

    List<Region> findTop2ByCountry(String Country);



    List<Region> findTopByCountryContainsOrderByRegion(String country);



}
