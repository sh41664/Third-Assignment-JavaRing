package org.project.object.weapons;

import org.project.entity.Entity;

public abstract class Weapon {
    private String name;
    private int damage;
    private int manaCost;
    private int durability; // Added durability

    public Weapon(String name, int damage, int manaCost, int durability) {
        this.name = name;
        this.damage = damage;
        this.manaCost = manaCost;
        this.durability = durability;
    }

    public void use(Entity target) {
        if (durability > 0) {
            System.out.println("Used " + name + " to attack!");
            target.takeDamage(damage);
            durability--; // Reduce durability each use
            System.out.println(name + " durability: " + durability);
        } else {
            System.out.println(name + " is broken and cannot be used!");
        }
    }

    public int getDamage() {
        return damage;
    }

    public int getManaCost() {
        return manaCost;
    }

    public String getName() {
        return name;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
