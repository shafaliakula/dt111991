package com.cco.dt111991.model;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class AffectedCities {

    public AffectedCities(){

    }

    public AffectedCities(Long id, String name, int population){

        this.id = id;
        this.name = name;
        this.population = population;
    }

    @Id
    private Long id;

    private String name;
    private int population;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

}
