package org.project.location;

import org.project.entity.enemies.Enemy;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private String name;
    private String description;
    private List<Enemy> enemies;

    public Location(String name, String description) {
        this.name = name;
        this.description = description;
        this.enemies = new ArrayList<>();
    }

    public Location(String name, String description, List<Enemy> enemies) {
        this.name = name;
        this.description = description;
        this.enemies = enemies;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void addEnemy(Enemy enemy) {
        this.enemies.add(enemy);
    }

    public void removeEnemy(Enemy enemy) {
        this.enemies.remove(enemy);
    }

    // BONUS: RESET EACH LOCATION AFTER PLAYER LEAVES
    public void resetLocation() {
        this.enemies.clear(); // Clear all enemies in the location
        System.out.println("Location " + name + " has been reset.");
    }
}
