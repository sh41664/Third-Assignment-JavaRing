package org.project.location;

import org.project.entity.enemies.Enemy;

import java.util.ArrayList;

public class Location
{
    private ArrayList<Location> locations;

    private ArrayList<Enemy> enemies;

    public Location (ArrayList<Location> locations, ArrayList<Enemy> enemies)
    {
        this.locations = locations;
        this.enemies = enemies;
    }

    public ArrayList <Location> getLocations ()
    {
        return locations;
    }

    public ArrayList <Enemy> getEnemies ()
    {
        return enemies;
    }
}
