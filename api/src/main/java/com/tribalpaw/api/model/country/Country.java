package com.tribalpaw.api.model.country;

import com.tribalpaw.api.model.army.Army;
import com.tribalpaw.api.model.province.Province;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@Entity
@Table(name = "countries")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer population;
    private Double wood;
    private Double stone;
    private Double metal;
    private Double gold;
    private Double tech;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private ArrayList<Province> provinces;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private ArrayList<Army> armies;

    public Country(
            Long id,
            String name,
            Integer population,
            Double stone,
            Double gold,
            Double wood,
            Double metal,
            Double tech,
            ArrayList<Province> provinces,
            ArrayList<Army> armies
    ) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.wood = wood;
        this.stone = stone;
        this.metal = metal;
        this.gold = gold;
        this.tech = tech;
        this.provinces = provinces;
        this.armies = armies;
    }
}