package com.cco.dt111991.service;

import java.util.List;

import com.cco.dt111991.model.AffectedCities;

public interface ICityService{
    List<AffectedCities> findAll();
}