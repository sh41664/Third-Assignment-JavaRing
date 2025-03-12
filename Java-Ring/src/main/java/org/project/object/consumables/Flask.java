package org.project.object.consumables;

import org.project.entity.Entity;
import org.project.entity.players.Player;

//TODO: UPDATE IMPLEMENTATION
public class Flask
{
    /*
    THIS IS AN EXAMPLE OF A CONSUMABLE DESIGN.
    */

    //TODO: (BONUS) UPDATE USE METHOD
    @Override
    public void use (Entity target)
    {
        target.heal (target.getMaxHP () / 10);
    }
}
