package com.tribalpaw.api.model.division;

import com.tribalpaw.api.model.army.Army;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "divisions")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private DivisionType type;
    private Integer level;
    private Double organization;
    private Double damage;
    private Double defense;

    @ManyToOne
    @JoinColumn(name = "army_id")
    private Army army;

    public Division(DivisionBuilder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.organization = builder.organization;
        this.damage = builder.damage;
        this.defense = builder.defense;
        this.army = builder.army;
    }

    public Integer levelUp() {
        this.level += 1;
        this.organization *= 2;
        this.damage *= 2;
        this.defense *= 2;
        return this.level;
    }

    public Double attack(Division division) {
        division.organization -= this.damage * division.defense;
        return division.organization;
    }
}