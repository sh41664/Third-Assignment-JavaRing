
package org.project.entity.players;
  // Fixed package

import org.project.entity.Entity;
import org.project.entity.players.Player;
import org.project.object.armors.Armor;
import org.project.object.weapons.Sword;
import org.project.object.weapons.Weapon;
import java.util.Random;

// TODO: UPDATE IMPLEMENTATION
public class Wizard extends Player {
    private String name;
    private int hp;
    private int maxHP;
    private int mp;
    private int maxMP;
    private Weapon weapon;
    private Armor armor;
    private Random random;

    public Wizard(String name, int hp, int maxHP, int mp, int maxMP, Weapon weapon, Armor armor) {
        super(name, hp, maxHP, mp, maxMP, weapon, armor);
        this.name = name;
        this.hp = hp;
        this.maxHP = maxHP;
        this.mp = mp;
        this.maxMP = maxMP;
        this.weapon = weapon;
        this.armor = armor;
        this.random = new Random();
    }

    public Wizard() {
        this("Wizard", 80, 80, 120, 120, new Sword(), null);
    }

    @Override
    public void attack(Entity target) {
        System.out.println(name + " attacked " + target.getClass().getSimpleName() + " with " + weapon.getName());
        weapon.use(target);
    }

    @Override
    public void defend() {
        System.out.println(name + " is defending and conjuring a magical barrier!");
        // TODO: Implement a defense method for shields
    }

    @Override
    public void takeDamage(int damage) {
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
        if (mp >= 30) {
            mp -= 30;
            int healAmount = 20 + random.nextInt(20); // Heals between 20 to 40
            int damageAmount = 15 + random.nextInt(15); // Damages between 15 to 30
            heal(healAmount);
            target.takeDamage(damageAmount);
            System.out.println(name + " cast a special spell, healed for " + healAmount + " and dealt " + damageAmount + " damage.");
        } else {
            System.out.println(name + " does not have enough mana to cast a spell!");
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
