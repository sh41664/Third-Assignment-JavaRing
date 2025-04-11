package org.project.object.consumables;

import org.project.entity.Entity;

public class Flask extends Consumable {
    /*
    THIS IS AN EXAMPLE OF A CONSUMABLE DESIGN.
    */

    public Flask(String name, String description, double weight, int value) {
        super(name, description, weight, value);
    }

    // BONUS: UPDATE USE METHOD
    @Override
    public void consume(Entity target) {
        int healAmount = (int) (target.getMaxHP() * 0.1);
        target.heal(healAmount);
        System.out.println(target.getClass().getSimpleName() + " healed for " + healAmount + " HP.");
    }
}
