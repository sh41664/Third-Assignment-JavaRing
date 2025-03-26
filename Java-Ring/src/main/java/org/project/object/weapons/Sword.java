package org.project.object.weapons;

import org.project.entity.Entity;

import java.util.ArrayList;
import java.util.Random;

public class Sword extends Weapon {
    /*
    THIS IS AN EXAMPLE OF A WEAPON DESIGN.
    */

    private String name;
    private int damage;
    private int manaCost;
    private int abilityCharge;
    private int maxCharge;
    private Random random;

    public Sword(String name, int damage, int manaCost, int durability) {
        super(name, damage, manaCost, durability);
        this.name = name;
        this.damage = damage;
        this.manaCost = manaCost;
        this.abilityCharge = 0;
        this.maxCharge = 5; // Example max charge
        this.random = new Random();
    }

    public Sword() {
        this("Default Sword", 25, 5, 10);
    }

    // BONUS: UPDATE THE UNIQUE ABILITY
    public void uniqueAbility(ArrayList<Entity> targets) {
        if (abilityCharge >= maxCharge) {
            System.out.println(getName() + " unleashed a powerful strike!");
            for (Entity target : targets) {
                int bonusDamage = random.nextInt(20) + 10; // 10-30 bonus damage
                System.out.println("Bonus Damage dealt: " + bonusDamage);
                target.takeDamage(getDamage() + bonusDamage);
            }
            abilityCharge = 0; // Reset ability charge
        } else {
            System.out.println(getName() + " ability is not ready yet! Charge: " + abilityCharge + "/" + maxCharge);
        }
    }

    @Override
    public void use(Entity target) {
        super.use(target); // Call the base class use method
        abilityCharge = Math.min(abilityCharge + 1, maxCharge); // Increase ability charge, but don't exceed max
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
}
