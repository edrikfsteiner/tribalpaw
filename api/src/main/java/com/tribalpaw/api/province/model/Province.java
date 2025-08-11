package com.tribalpaw.api.province.model;

import com.tribalpaw.api.building.model.Building;
import com.tribalpaw.api.country.model.Country;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
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
    private List<Building> buildings;
}