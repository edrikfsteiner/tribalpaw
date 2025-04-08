package com.tribalpaw.api.model.building.factory;

import com.tribalpaw.api.model.building.Building;
import com.tribalpaw.api.model.building.BuildingType;
import com.tribalpaw.api.model.building.product.*;

public class BuildingFactory {
    public Building construct(BuildingType building) {
        return switch (building) {
            case GOLDMINE -> new GoldMine();
            case LUMBER -> new Lumber();
            case MINE -> new Mine();
            case QUARRY -> new Quarry();
            case RESIDENCE -> new Residence();
            case UNIVERSITY -> new University();
        };
    }
}