package com.tribalpaw.api.model.province;

import com.tribalpaw.api.model.building.Building;
import com.tribalpaw.api.model.country.Country;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Builder
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
    private Double popGrowth;
    private Double woodGrowth;
    private Double stoneGrowth;
    private Double metalGrowth;
    private Double goldGrowth;
    private Double techGrowth;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToMany(mappedBy = "province", cascade = CascadeType.ALL)
    private ArrayList<Building> buildings;

    public Province(
            Long id,
            String name,
            Integer population,
            Double popGrowth,
            Double woodGrowth,
            Double stoneGrowth,
            Double metalGrowth,
            Double goldGrowth,
            Double techGrowth,
            Country country,
            ArrayList<Building> buildings
    ) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.popGrowth = popGrowth;
        this.woodGrowth = woodGrowth;
        this.stoneGrowth = stoneGrowth;
        this.metalGrowth = metalGrowth;
        this.goldGrowth = goldGrowth;
        this.techGrowth = techGrowth;
        this.country = country;
        this.buildings = buildings;
    }
}