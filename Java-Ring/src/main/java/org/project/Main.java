package org.project;

import org.project.entity.Entity;
import org.project.entity.enemies.Dragon;
import org.project.entity.enemies.Enemy;
import org.project.entity.enemies.Goblin;
import org.project.entity.enemies.Skeleton;
import org.project.entity.players.Assassin;
import org.project.entity.players.Knight;
import org.project.entity.players.Player;
import org.project.entity.players.Wizard;
import org.project.location.Location;
import org.project.object.weapons.Sword;
import org.project.object.weapons.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Add some locations to your game
        List<Location> locations = new ArrayList<>();
        locations.add(new Location("Forest", "A dense forest filled with mysterious creatures."));
        locations.add(new Location("Cave", "A dark and damp cave, home to dangerous monsters."));
        locations.add(new Location("Ruins", "Ancient ruins with forgotten treasures and lurking enemies."));

        // Initialize player and game
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Java-Ring!");
        System.out.println("Choose your character:");
        System.out.println("1. Knight");
        System.out.println("2. Wizard");
        System.out.println("3. Assassin");

        int choice;
        while (true) {
            try {
                choice = scanner.nextInt();
                if (choice >= 1 && choice <= 3) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please choose again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
        scanner.nextLine(); // Consume newline

        Player player;
        Weapon startingWeapon = new Sword(); // Default weapon
        switch (choice) {
            case 1:
                player = new Knight("Arthur", 100, 100, 50, 50, startingWeapon, null);
                break;
            case 2:
                player = new Wizard("Merlin", 80, 80, 100, 100, startingWeapon, null);
                break;
            case 3:
                player = new Assassin("Shadow", 70, 70, 70, 70, startingWeapon, null);
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Knight.");
                player = new Knight("Arthur", 100, 100, 50, 50, startingWeapon, null);
                break;
        }

        System.out.println("You have chosen: " + player.getClass().getSimpleName());

        // Game loop
        boolean gameRunning = true;
        Location currentLocation = locations.get(0); // Start in the first location
        System.out.println("You are in the " + currentLocation.getName() + ": " + currentLocation.getDescription());

        while (gameRunning) {
            // Generate a random monster
            Enemy enemy;
            int monsterChoice = random.nextInt(3);
            switch (monsterChoice) {
                case 0:
                    enemy = new Goblin();
                    break;
                case 1:
                    enemy = new Dragon();
                    break;
                case 2:
                    enemy = new Skeleton();
                    break;
                default:
                    enemy = new Goblin();
                    break;
            }

            System.out.println("A wild " + enemy.getClass().getSimpleName() + " appears!");

            // Combat loop
            while (player.isAlive() && enemy.isAlive()) {
                System.out.println("\nYour turn! Choose an action:");
                System.out.println("1. Attack");
                System.out.println("2. Defend");
                System.out.println("3. Use Unique Ability");

                int action;
                while (true) {
                    try {
                        action = scanner.nextInt();
                        if (action >= 1 && action <= 3) {
                            break;
                        } else {
                            System.out.println("Invalid action. Please choose again.");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // Clear invalid input
                    }
                }
                scanner.nextLine(); // Consume newline

                switch (action) {
                    case 1:
                        player.attack(enemy);
                        break;
                    case 2:
                        player.defend();
                        break;
                    case 3:
                        player.useUniqueAbility(enemy);
                        break;
                    default:
                        System.out.println("Invalid action. You lose your turn.");
                        break;
                }

                if (enemy.isAlive()) {
                    // Enemy's turn
                    int enemyAction = random.nextInt(2); // 0 for attack, 1 for defend
                    switch (enemyAction) {
                        case 0:
                            enemy.attack(player);
                            break;
                        case 1:
                            enemy.defend();
                            break;
                    }
                }
            }

            // Check the outcome of the battle
            if (player.isAlive()) {
                System.out.println("You defeated the " + enemy.getClass().getSimpleName() + "!");
                // Ask player if they want to move to another location or quit
                System.out.println("What do you want to do?");
                System.out.println("1. Move to another location");
                System.out.println("2. Quit game");
                int moveChoice;
                while (true) {
                    try {
                        moveChoice = scanner.nextInt();
                        if (moveChoice >= 1 && moveChoice <= 2) {
                            break;
                        } else {
                            System.out.println("Invalid choice. Please choose again.");
                        }
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // Clear invalid input
                    }
                }
                scanner.nextLine(); // Consume newline

                switch (moveChoice) {
                    case 1:
                        // Change location
                        if (locations.size() > 1) {
                            int nextLocationIndex = random.nextInt(locations.size());
                            currentLocation = locations.get(nextLocationIndex);
                            System.out.println("You moved to the " + currentLocation.getName() + ": " + currentLocation.getDescription());
                        } else {
                            System.out.println("No other locations available.");
                        }
                        break;
                    case 2:
                        gameRunning = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Quitting game.");
                        gameRunning = false;
                        break;
                }
            } else {
                System.out.println("You have been defeated. Game Over!");
                gameRunning = false;
            }
        }

        System.out.println("Thanks for playing Java-Ring!");
        scanner.close();
    }
}
