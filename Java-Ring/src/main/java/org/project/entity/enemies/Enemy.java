package org.project.entity.enemies;

import org.project.entity.Entity;
import org.project.object.weapons.Weapon;

import java.util.PrimitiveIterator;

//TODO: UPDATE IMPLEMENTATION
public abstract class Enemy
{
    private int hp;
    private int mp;

    Weapon weapon;

    public Enemy (int hp, int mp, Weapon weapon)
    {
        this.hp = hp;
        this.mp = mp;

        this.weapon = weapon;
    }

    //TODO: (BONUS) UPDATE THE FORMULA OF TAKING DAMAGE
    @Override
    public void takeDamage (int damage)
    {
        hp -= damage;
    }

    public int getHp ()
    {
        return hp;
    }

    public int getMp ()
    {
        return mp;
    }

    public Weapon getWeapon ()
    {
        return weapon;
    }
}
