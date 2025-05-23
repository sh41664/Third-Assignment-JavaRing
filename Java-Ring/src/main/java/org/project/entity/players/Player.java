package org.project.entity.players;

import org.project.entity.Entity;
import org.project.object.armors.Armor;
import org.project.object.weapons.Weapon;

// TODO: UPDATE IMPLEMENTATION
public abstract class Player implements Entity {
    protected String name;
    Weapon weapon;
    Armor armor;
    private int hp;
    private int maxHP;
    private int mp;
    private int maxMP;

    public Player(String name, int hp, int maxHP, int mp, int maxMP, Weapon weapon, Armor armor) {
        this.name = name;
        this.hp = hp;
        this.maxHP = maxHP;
        this.mp = mp;
        this.maxMP = maxMP;
        this.weapon = weapon;
        this.armor = armor;
    }

    @Override
    public void attack(Entity target) {
        System.out.println(name + " attacked " + target.getClass().getSimpleName() + " with " + weapon.getName());
        weapon.use(target);
    }

    @Override
    public void defend() {
        System.out.println(name + " is defending.");
        // TODO: (BONUS) IMPLEMENT A DEFENSE METHOD FOR SHIELDS
    }

    // TODO: (BONUS) UPDATE THE FORMULA OF TAKING DAMAGE
    @Override
    public void takeDamage(int damage) {
        int damageAfterArmor = damage;
        if (armor != null) {
            damageAfterArmor -= armor.getDefense();
            if (damageAfterArmor < 0) {
                damageAfterArmor = 0;
            }
            armor.takeDamage(damage); // Armor takes damage
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

    public Armor getArmor() {
        return armor;
    }

    @Override
    public boolean isAlive() {
        return hp > 0;
    }
}
