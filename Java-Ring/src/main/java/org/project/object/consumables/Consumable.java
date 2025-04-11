package org.project.object.consumables;

import org.project.entity.Entity;
import org.project.object.Object;

public abstract class Consumable implements Object {
    private String name;
    private String description;
    private double weight;
    private int value;

    public Consumable(String name, String description, double weight, int value) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.value = value;
    }

    // Abstract method to define how the consumable is used
    public abstract void consume(Entity target);

    @Override
    public void use(Entity target) {
        System.out.println(target.getClass().getSimpleName() + " used " + name + ".");
        consume(target);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public int getValue() {
        return value;
    }
}
