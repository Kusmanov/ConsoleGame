package org.example.entity;

import java.util.Arrays;

public abstract class Unit {
    private final String name;
    private int[] location;
    private int power;
    private int agility;
    private int health;

    public Unit(String name, int[] location, int power, int agility, int health) {
        this.name = name;
        this.location = location;
        this.power = power;
        this.agility = agility;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int[] getLocation() {
        return location;
    }

    public void setLocation(int[] location) {
        this.location = location;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", location=" + Arrays.toString(location) +
                ", power=" + power +
                ", agility=" + agility +
                ", health=" + health +
                '}';
    }
}
