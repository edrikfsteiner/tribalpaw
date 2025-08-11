package com.tribalpaw.api.country.model;

import com.tribalpaw.api.army.model.Army;
import com.tribalpaw.api.province.model.Province;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private List<Province> provinces;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<Army> armies;
}