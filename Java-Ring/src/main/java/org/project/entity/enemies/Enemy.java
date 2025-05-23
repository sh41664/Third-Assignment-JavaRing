package org.project.entity.enemies;

import org.project.entity.Entity;
import org.project.object.weapons.Weapon;

// TODO: UPDATE IMPLEMENTATION
public abstract class Enemy implements Entity {
    protected String name;
    Weapon weapon;
    private int hp;
    private int maxHP;
    private int mp;
    private int maxMP;

    public Enemy(String name, int hp, int maxHP, int mp, int maxMP, Weapon weapon) {
        this.name = name;
        this.hp = hp;
        this.maxHP = maxHP;
        this.mp = mp;
        this.maxMP = maxMP;
        this.weapon = weapon;
    }

    @Override
    public void attack(Entity target) {
        System.out.println(name + " attacked " + target.getClass().getSimpleName() + " with " + weapon.getName());
        target.takeDamage(weapon.getDamage());
    }

    @Override
    public void defend() {
        System.out.println(name + " is defending.");
    }

    // TODO: (BONUS) UPDATE THE FORMULA OF TAKING DAMAGE
    @Override
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
        System.out.println(name + " took " + damage + " damage. HP: " + hp);
    }

    @Override
    public void heal(int health) {
        hp += health;
        if (hp > maxHP) {
            hp = maxHP;
        }
        System.out.println(name + " healed for " + health + " HP. Current HP: " + hp);
    }

    @Override
    public void fillMana(int mana) {
        mp += mana;
        if (mp > maxMP) {
            mp = maxMP;
        }
        System.out.println(name + " filled " + mana + " MP. Current MP: " + mp);
    }

    public abstract void useUniqueAbility(Entity target);

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    @Override
    public int getMaxHP() {
        return maxHP;
    }

    public int getMp() {
        return mp;
    }

    @Override
    public int getMaxMP() {
        return maxMP;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }
}
