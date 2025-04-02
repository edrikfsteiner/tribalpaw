package com.tribalpaw.api.model.army;

import com.tribalpaw.api.model.army.division.Division;
import com.tribalpaw.api.model.country.Country;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@Entity
@Table(name = "armies")
public class Army {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToMany(mappedBy = "army", cascade = CascadeType.ALL)
    private ArrayList<Division> divisions;

    public Army(Long id, String name, ArrayList<Division> divisions) {
        this.id = id;
        this.name = name;
        this.divisions = divisions;
    }
}