package org.project.object.armors;

public abstract class Armor {
    private String name;
    private int defense;
    private int maxDefense;
    private int durability;
    private int maxDurability;

    private boolean isBroke;

    public Armor(String name, int defense, int maxDefense, int durability, int maxDurability) {
        this.name = name;
        this.defense = defense;
        this.maxDefense = maxDefense;
        this.durability = durability;
        this.maxDurability = maxDurability;
        this.isBroke = false;
    }

    public void checkBreak() {
        if (durability <= 0) {
            isBroke = true;
            defense = 0;
            System.out.println(name + " has broken!");
        }
    }

    // BONUS: UPDATE THE REPAIR METHOD
    public void repair(int amount) {
        if (isBroke) {
            durability = Math.min(durability + amount, maxDurability);
            if (durability >= maxDurability) {
                isBroke = false;
                defense = maxDefense;
                System.out.println(name + " has been fully repaired!");
            } else {
                System.out.println(name + " has been partially repaired.");
            }
        } else {
            System.out.println(name + " is not broken.");
        }
    }

    public int getDefense() {
        return defense;
    }

    public int getDurability() {
        return durability;
    }

    public boolean isBroke() {
        return isBroke;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        durability -= damage;
        checkBreak();
        System.out.println(name + " took " + damage + " damage. Remaining durability: " + durability);
    }
}
