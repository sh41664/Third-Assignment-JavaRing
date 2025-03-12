package org.project.entity.players;

import org.project.object.armors.Armor;
import org.project.object.armors.KnightArmor;
import org.project.object.weapons.Sword;
import org.project.object.weapons.Weapon;

//TODO: UPDATE IMPLEMENTATION
public class Knight extends Player
{
    public Knight (String name)
    {
        super (name, 1000, 100, new Sword (), new KnightArmor ());
    }

    @Override
    public void attack ()
    {

    }

    @Override
    public void defend ()
    {

    }
}
