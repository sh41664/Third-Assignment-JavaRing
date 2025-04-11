package org.project.entity.enemies;

import org.project.entity.Entity;
import org.project.entity.players.Player;
import org.project.object.weapons.Sword;
import org.project.object.weapons.Weapon;

import java.util.ArrayList;
import java.util.Random;

public class Dragon extends Enemy {
    private String name;
    private int hp;
    private int maxHP;
    private int mp;
    private int maxMP;
    private Weapon weapon;
    private Random random;

    public Dragon(String name, int hp, int maxHP, int mp, int maxMP, Weapon weapon) {
        super(name, hp, maxHP, mp, maxMP, weapon);
        this.name = name;
        this.hp = hp;
        this.maxHP = maxHP;
        this.mp = mp;
        this.maxMP = maxMP;
        this.weapon = weapon;
        this.random = new Random();
    }

    public Dragon() {
        this("Dragon", 150, 150, 50, 50, new Sword());
    }

    @Override
    public void attack(Entity target) {
        System.out.println(name + " breathes fire at " + target.getClass().getSimpleName() + " with " + weapon.getName());
        target.takeDamage(weapon.getDamage());
    }

    @Override
    public void defend() {
        System.out.println(name + " is scaling its armor!");
    }

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
        System.out.println(name + " cannot be healed!");
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
        System.out.println(name + " uses Dragon Breath!");
        if (target instanceof Player) {
            System.out.println(name + " bypasses the shield");
            target.takeDamage(weapon.getDamage());
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

    @Override
    public boolean isAlive() {
        return hp > 0;
    }
}
