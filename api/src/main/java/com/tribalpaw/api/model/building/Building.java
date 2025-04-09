package com.tribalpaw.api.model.building;

import com.tribalpaw.api.model.province.Province;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@Entity
@Table(name = "buildings")
public abstract class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected String name;
    protected Integer level;
    protected Double resourceGrowth;

    @ManyToOne
    @JoinColumn(name = "province_id")
    protected Province province;

    public Building(Long id, String name, Integer level, Double resourceGrowth, Province province) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.resourceGrowth = resourceGrowth;
        this.province = province;
    }

    public Integer levelUp() {
        this.level += 1;
        this.resourceGrowth *= 2;
        return this.level;
    }
}