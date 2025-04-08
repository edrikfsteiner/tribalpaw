package com.tribalpaw.api.model.province;

import com.tribalpaw.api.model.building.Building;
import com.tribalpaw.api.model.country.Country;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@Entity
@Table(name = "provinces")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer population;
    private Double pop_growth;
    private Double wood_growth;
    private Double stone_growth;
    private Double metal_growth;
    private Double gold_growth;
    private Double tech_growth;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToMany(mappedBy = "province", cascade = CascadeType.ALL)
    private ArrayList<Building> buildings;

    public Province(
            Long id,
            String name,
            Integer population,
            Double pop_growth,
            Double wood_growth,
            Double stone_growth,
            Double metal_growth,
            Double gold_growth,
            Double tech_growth,
            Country country
    ) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.pop_growth = pop_growth;
        this.wood_growth = wood_growth;
        this.stone_growth = stone_growth;
        this.metal_growth = metal_growth;
        this.gold_growth = gold_growth;
        this.tech_growth = tech_growth;
        this.country = country;
    }
}