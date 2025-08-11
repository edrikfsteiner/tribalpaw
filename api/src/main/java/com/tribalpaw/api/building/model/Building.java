package com.tribalpaw.api.building.model;

import com.tribalpaw.api.province.model.Province;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
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

    public Integer levelUp() {
        this.level += 1;
        this.resourceGrowth *= 2;
        return this.level;
    }
}