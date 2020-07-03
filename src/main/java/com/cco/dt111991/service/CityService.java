package com.cco.dt111991.service;

import com.cco.dt111991.service.ICityService;
import com.cco.dt111991.model.AffectedCities;
import com.cco.dt111991.respository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CityService implements ICityService{

    @Autowired
    private CityRepository repository;

    @Override
    public List<AffectedCities> findAll(){
        List<AffectedCities> cities = (List<AffectedCities>) repository.findAll();
        return cities;
    }
}