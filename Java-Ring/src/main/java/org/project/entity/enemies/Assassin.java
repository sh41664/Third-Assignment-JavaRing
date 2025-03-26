package org.project.entity.players;


import org.project.entity.Entity;
import org.project.entity.players.Player;
import org.project.object.armors.Armor;
import org.project.object.weapons.Sword;
import org.project.object.weapons.Weapon;

import java.util.Random;

public class Assassin extends Player {
    private String name;
    private int hp;
    private int maxHP;
    private int mp;
    private int maxMP;
    private Weapon weapon;
    private Armor armor;
    private boolean isInvisible;
    private Random random;

    public Assassin(String name, int hp, int maxHP, int mp, int maxMP, Weapon weapon, Armor armor) {
        super(name, hp, maxHP, mp, maxMP, weapon, armor);
        this.name = name;
        this.hp = hp;
        this.maxHP = maxHP;
        this.mp = mp;
        this.maxMP = maxMP;
        this.weapon = weapon;
        this.armor = armor;
        this.isInvisible = false;
        this.random = new Random();
    }

    public Assassin() {
        this("Assassin", 70, 70, 70, 70, new Sword(), null);
    }

    @Override
    public void attack(Entity target) {
        System.out.println(name + " attacked " + target.getClass().getSimpleName() + " with " + weapon.getName());
        int damage = weapon.getDamage();
        if (isInvisible) {
            damage *= 1.5; // Increased damage when invisible
            System.out.println(name + " strikes from the shadows, dealing extra damage!");
            isInvisible = false; // Invisibility ends after attack
        }
        target.takeDamage(damage);
    }

    @Override
    public void defend() {
        System.out.println(name + " is focusing on evasion!");
    }

    @Override
    public void takeDamage(int damage) {
        if (isInvisible) {
            System.out.println(name + " dodged the attack due to invisibility!");
            isInvisible = false; // Invisibility breaks upon dodging
            return; // No damage taken
        }

        int damageAfterArmor = damage;
        if (armor != null) {
            damageAfterArmor -= armor.getDefense();
            if (damageAfterArmor < 0) {
                damageAfterArmor = 0;
            }
            armor.takeDamage(damage);
        }

        hp -= damageAfterArmor;
        if (hp < 0) {
            hp = 0;
        }
        System.out.println(name + " took " + damageAfterArmor + " damage. HP: " + hp);
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

    @Override
    public void useUniqueAbility(Entity target) {
        if (!isInvisible) {
            isInvisible = true;
            System.out.println(name + " became invisible!");
        } else {
            System.out.println(name + " is already invisible!");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public Object getHealth() {
        return null;
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

    public Armor getArmor() {
        return armor;
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }
}
