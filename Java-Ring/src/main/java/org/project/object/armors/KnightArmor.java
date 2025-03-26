package org.project.object.armors;

public class KnightArmor extends Armor {
    private String name;
    private int defense;
    private int maxDefense;
    private int durability;
    private int maxDurability;

    public KnightArmor(String name, int defense, int maxDefense, int durability, int maxDurability) {
        super(name, defense, maxDefense, durability, maxDurability);
        this.name = name;
        this.defense = defense;
        this.maxDefense = maxDefense;
        this.durability = durability;
        this.maxDurability = maxDurability;
    }

    public KnightArmor() {
        this("Knight's Armor", 40, 40, 80, 80);
    }

    public int getDefense() {
        return defense;
    }

    public int getMaxDefense() {
        return maxDefense;
    }

    public int getDurability() {
        return durability;
    }

    public int getMaxDurability() {
        return maxDurability;
    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        durability -= damage;
        if (durability < 0) {
            durability = 0;
        }
    }
}
