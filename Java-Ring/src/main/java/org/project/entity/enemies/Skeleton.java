package org.project.entity.enemies;

import org.project.entity.Entity;
import org.project.object.weapons.Sword;
import org.project.object.weapons.Weapon;

public class Skeleton extends Enemy {
    private String name;
    private int hp;
    private int maxHP;
    private int mp;
    private int maxMP;
    private Weapon weapon;

    private boolean resurrected = false;

    public Skeleton(String name, int hp, int maxHP, int mp, int maxMP, Weapon weapon) {
        super(name, hp, maxHP, mp, maxMP, weapon);
        this.name = name;
        this.hp = hp;
        this.maxHP = maxHP;
        this.mp = mp;
        this.maxMP = maxMP;
        this.weapon = weapon;
    }

    public Skeleton() {
        this("Skeleton", 70, 70, 30, 30, new Sword());
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if (getHp() <= 0 && !resurrected) {
            resurrected = true;
            this.hp = maxHP / 2;
            System.out.println(name + " resurrected with half its health!");
        }
    }

    @Override
    public Object getHealth() {
        return null;
    }

    @Override
    public void useUniqueAbility(Entity target) {

    }

    // Example attack method
    @Override
    public void attack(Entity target) {
        System.out.println(name + " attacked " + target.getClass().getSimpleName() + " with " + weapon.getName());
        target.takeDamage(weapon.getDamage());
    }
}
