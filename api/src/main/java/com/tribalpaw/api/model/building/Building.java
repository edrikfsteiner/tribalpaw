package com.tribalpaw.api.model.building;

import com.tribalpaw.api.model.province.Province;
import jakarta.persistence.*;

@Entity
@Table(name = "buildings")
public interface Building {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id = null;

    String name = null;
    Integer level = null;
    Double pop_growth = null;
    Double wood_growth = null;
    Double stone_growth = null;
    Double metal_growth = null;
    Double gold_growth = null;
    Double tech_growth = null;

    @ManyToOne
    @JoinColumn(name = "province_id")
    Province province = null;

    Integer levelUp();
}