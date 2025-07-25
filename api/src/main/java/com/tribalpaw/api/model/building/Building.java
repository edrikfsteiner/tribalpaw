package com.tribalpaw.api.model.building;

import com.tribalpaw.api.model.province.Province;
import jakarta.persistence.*;
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