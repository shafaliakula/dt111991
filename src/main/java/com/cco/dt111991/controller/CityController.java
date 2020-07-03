package com.cco.dt111991.controller;

import com.cco.dt111991.model.AffectedCities;
import com.cco.dt111991.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CityController{
    @Autowired
    private ICityService cityService;

@RequestMapping
    public List<AffectedCities> findCities(Model model){
        List<AffectedCities>  citiesList = cityService.findAll();
        return citiesList;
    }
}