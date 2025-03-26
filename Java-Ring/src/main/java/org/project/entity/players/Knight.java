package org.project.entity.players;

import org.project.entity.Entity;
import org.project.object.armors.Armor;
import org.project.object.weapons.Sword;
import org.project.object.weapons.Weapon;

public class Knight extends Player {
    private Weapon weapon;
    private Armor armor;

    public Knight(String name, int health, int maxHP, int mana, int maxMP, Weapon weapon, Armor armor) {
        super(name, health, maxHP, mana, maxMP, weapon, armor);
        this.weapon = weapon;
        this.armor = armor;
    }

    public Knight(String name, int health, int maxHP, int mana, int maxMP) {
        this(name, health, maxHP, mana, maxMP, new Sword(), null); // Default weapon is a sword
    }

    @Override
    public void takeDamage(int damage) {
        if (armor != null) {
            int mitigatedDamage = damage;
            if(armor.getDefense() > 0) {
                mitigatedDamage = Math.max(0, damage - armor.getDefense());
            }
            super.takeDamage(mitigatedDamage);
            armor.takeDamage(damage); // Armor also takes damage
        } else {
            super.takeDamage(damage);
        }
    }

    @Override
    public Object getHealth() {
        return null;
    }

    @Override
    public void attack(Entity target) {
        System.out.println(getName() + " attacked " + target.getClass().getSimpleName() + " with " + weapon.getName());
        weapon.use(target);
    }

    @Override
    public void useUniqueAbility(Entity target) {
        System.out.println(getName() + " used a Strong Kick on " + target.getClass().getSimpleName() + "!");
        target.takeDamage(30); // Example damage
    }
}
