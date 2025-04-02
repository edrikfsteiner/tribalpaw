package com.tribalpaw.api.model.army.division;

public class DivisionBuilder {
    protected Long id;
    protected DivisionType type;
    protected Double organization;
    protected Double damage;
    protected Double defense;

    public void id(Long id) {
        this.id = id;
    }

    public void type(DivisionType type) {
        this.type = type;
    }

    public void organization(Double organization) {
        this.organization = organization;
    }

    public void damage(Double damage) {
        this.damage = damage;
    }

    public void defense(Double defense) {
        this.defense = defense;
    }

    public Division build(DivisionType type) {
        switch (type) {
            case LEVY:
                id(id);
                type(type);
                organization(10.0);
                damage(1.0);
                defense(0.1);
                return new Division(this);

            case INFANTRY:
                id(id);
                type(type);
                organization(20.0);
                damage(2.0);
                defense(0.2);
                return new Division(this);

            case ARCHERY:
                id(id);
                type(type);
                organization(15.0);
                damage(2.0);
                defense(0.1);
                return new Division(this);

            case PIKEMEN:
                id(id);
                type(type);
                organization(20.0);
                damage(1.5);
                defense(0.3);
                return new Division(this);

            case CAVALRY:
                id(id);
                type(type);
                organization(30.0);
                damage(4.0);
                defense(0.2);
                return new Division(this);

            case ARTILLERY:
                id(id);
                type(type);
                organization(15.0);
                damage(3.0);
                defense(0.1);
                return new Division(this);

            default:
                return new Division(this);
        }
    }
}