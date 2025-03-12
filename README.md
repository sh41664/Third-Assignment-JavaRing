# **Java-Ring** 🎮  
A turned-based RPG inspired by Souls-like games which can be run in terminal

### **Introduction**  
Welcome to your weekly programming assignment! In this project, you will build a **text-based role-playing game (RPG)** using **Object-Oriented Programming (OOP) principles**, including *inheritance, polymorphism, and interfaces*. Your task is to implement a class hierarchy for different game entities, including **players and monsters**, each with unique abilities and attributes.  

By the end of this project, you will have a *functional game system* where players can **fight monsters in a turn-based combat system**, reinforcing your understanding of *OOP design* in a practical way.

### What is a turned-based game?
In this combat system, two sides - which are usually the players side and the enemies side - attack each other in turns. The side which is not attacking can do some actions to avoid or deflect enemy's attack.


## 📌 Learning Objectives  
Through this assignment, you will:  
✅ Learn and apply **inheritance** to structure a game class hierarchy.  
✅ Understand and implement **interfaces** and **abstract classes**.  
✅ Use **polymorphism** to handle interactions between game entities.  
✅ Practice **code reusability** and **modularity** in Java.  
✅ Develop a **terminal-based game** that showcases OOP concepts.  
✅ Develop a creative gameplay to make it a playable simple game.

## 📝 Assignment Tasks  

### 1️⃣ Step 1: Fork & Setup 🍴  
1. **Fork** this repository and clone it to your local machine.  
2. Create a new branch named `develop` and switch to it.    


### 2️⃣ Step 2: Implement the Class Hierarchy 🌲  

- You must implement the class hierarchy as shown in the diagram below:  

![Class Hierarchy](resources/image.png)  

- Class Descriptions:  

<!-- todo -->

### 3️⃣ Step 3: Implement Player & Monster Methods 🏹  

Each class should have the appropriate attributes and methods.  

✅ Basic Actions:

<!-- todo -->

✅ Unique Abilities:

<br />
🔹 Make sure each entity **prints messages** when performing actions:  

```bash
Arthur (Knight) attacked Goblin!
Goblin took 15 damage!
Goblin has 35 health remaining.
```


### 4️⃣ Step 4: Implement the Game Loop 🎮  
Create a simple **turn-based combat system** in a main game loop:  

1. Players choose a character (Assassin, Knight, or Wizard).  
2. A random monster (Goblin, Dragon, or Skeleton) is generated.  
3. The player and the monster take turns attacking each other.
4. Game ends when either the player or the monster dies.

<br />
🔹 Example game loop structure:  

```java
while (player.isAlive() && enemy.isAlive()) {
    player.attack(enemy);
    if (enemy.isAlive()) {
        enemy.attack(player);
    }
}
```


### 5️⃣ Step 5: Extra Features & Bonus Tasks ⭐  
Want to **earn extra points**? Try implementing one of these:  

✅ **(Optional) Inventory System**:  
- Allow players to **pick up and use items** like different classes of shield and more potions.  

✅ **(Optional) Experience & Leveling System**:  
- Players gain XP from battles and level up, increasing their **attack power**.  

✅ **(Optional) Multiple Players**:  
- Let players form a **party** and fight monsters together.  

✅ **(Bonus) PvP Mode**:  
- Implement a **Player vs. Player** combat system.  


## 🔍 Grading Criteria 🏆  
Your assignment will be graded based on the following criteria:  

| **Criteria**           | **Points**  |
|------------------------|------------|
| Correct class hierarchy implementation | **30** |
| Proper use of OOP principles (inheritance, interfaces) | **20** |
| Working combat system with player & monster interactions | **20** |
| Meaningful console outputs for actions | **10** |
| Code readability, documentation, and comments | **10** |
| Extra features (bonus tasks) | **10** |
| **Total Score** | **100** |


## 💡 Submission Guidelines  
✅ **Deadline**: Submit your assignment before **March 19th, 2025**.  
✅ **Submission Format**:  
1. Push your code to **your forked repository**.  
2. Create a **pull request** to the main branch.  
3. Include a **README.md** with explanations of your implementation.  

📌 **Note:** Late submissions may receive **deductions**!  


## 🚀 Tips for Success  
💡 **Follow OOP principles**: Avoid redundant code by using inheritance properly.  
💡 **Test your code**: Run different scenarios to ensure everything works as expected.  
💡 **Ask for help**: If you're stuck, reach out to your classmates or mentors.  

🎯 Your goal is not just to complete the assignment but to learn and apply OOP effectively!  

**Good luck, and have fun coding!** 🚀
