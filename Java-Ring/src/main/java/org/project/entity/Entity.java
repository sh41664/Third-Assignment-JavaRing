package org.project.entity;

public interface Entity
{
    public void attack ();

    public void defend ();

    public void heal (int health);

    public void takeDamage (int damage);

    public int getMaxHP ();

    public int getMaxMP ();

    /*
    TODO: ADD OTHER REQUIRED AND BONUS METHODS
    */
}
