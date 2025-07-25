package com.tribalpaw.api.model.province;

import com.tribalpaw.api.model.building.Building;
import com.tribalpaw.api.model.country.Country;
import jakarta.persistence.*;
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