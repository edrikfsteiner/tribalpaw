package com.tribalpaw.api.model.division;

import com.tribalpaw.api.model.army.Army;

public class DivisionBuilder {
    protected Long id;
    protected DivisionType type;
    protected Integer level;
    protected Double organization;
    protected Double damage;
    protected Double defense;
    protected Army army;

    public DivisionBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public DivisionBuilder type(DivisionType type) {
        this.type = type;
        return this;
    }

    public DivisionBuilder level(Integer level) {
        this.level = level;
        return this;
    }

    public DivisionBuilder organization(Double organization) {
        this.organization = organization;
        return this;
    }

    public DivisionBuilder damage(Double damage) {
        this.damage = damage;
        return this;
    }

    public DivisionBuilder defense(Double defense) {
        this.defense = defense;
        return this;
    }

    public DivisionBuilder army(Army army) {
        this.army = army;
        return this;
    }

    public Division build(DivisionType type) {
        switch (type) {
            case LEVY:
                id(id);
                type(type);
                level(1);
                organization(10.0);
                damage(1.0);
                defense(0.1);
                army(army);
                return new Division(this);

            case INFANTRY:
                id(id);
                type(type);
                level(1);
                organization(20.0);
                damage(2.0);
                defense(0.2);
                army(army);
                return new Division(this);

            case ARCHERY:
                id(id);
                type(type);
                level(1);
                organization(15.0);
                damage(2.0);
                defense(0.1);
                army(army);
                return new Division(this);

            case PIKEMEN:
                id(id);
                type(type);
                level(1);
                organization(20.0);
                damage(1.5);
                defense(0.3);
                army(army);
                return new Division(this);

            case CAVALRY:
                id(id);
                type(type);
                level(1);
                organization(30.0);
                damage(4.0);
                defense(0.2);
                army(army);
                return new Division(this);

            case ARTILLERY:
                id(id);
                type(type);
                level(1);
                organization(15.0);
                damage(3.0);
                defense(0.1);
                army(army);
                return new Division(this);

            default:
                return new Division(this);
        }
    }
}