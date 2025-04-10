package com.tribalpaw.api.model.building.factory;

import com.tribalpaw.api.model.building.Building;
import com.tribalpaw.api.model.building.BuildingType;
import com.tribalpaw.api.model.building.product.*;

public class BuildingFactory {
    public Building construct(BuildingType building) {
        return switch (building) {
            case GOLDMINE -> new GoldMine(null, "Gold mine", 1, 1.0, null);
            case LUMBER -> new Lumber(null, "Lumber", 1, 1.0, null);
            case MINE -> new Mine(null, "Mine", 1, 1.0, null);
            case QUARRY -> new Quarry(null, "Quarry", 1, 1.0, null);
            case RESIDENCE -> new Residence(null, "Residence", 1, 1.0, null);
            case UNIVERSITY -> new University(null, "University", 1, 1.0, null);
        };
    }
}