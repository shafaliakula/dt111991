package com.cco.dt111991.respository;

import org.springframework.stereotype.Repository;
import com.cco.dt111991.model.AffectedCities;

@Repository
public interface CityRepository extends Repository{
    Object findAll();
}