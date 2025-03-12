# **Java-Ring** 🎮  
A turned-based RPG inspired by Souls-like games which can be run in terminal

### **Introduction**  
Welcome to **Java-Ring**, a turn-based RPG inspired by Souls-like games! In this assignment, you will develop a **text-based role-playing game (RPG)** that follows a structured combat system where players engage in battles against powerful monsters. This project is designed to reinforce your understanding of **Object-Oriented Programming (OOP) principles**, including *inheritance, polymorphism, and interfaces*.  

Your task is to implement a class hierarchy for different game entities, including **players and monsters**, each with unique abilities and attributes. By the end of this project, you will have a *functional game system* where players can **fight monsters in a turn-based combat system**, reinforcing your understanding of *OOP design* in a practical way.

### **Game Concept**  
Java-Ring is a turn-based game where players take on the role of powerful warriors, each wielding unique weapons, and face off against fearsome monsters in combat. Both players and monsters have their own **health, attack power, and special abilities**. The game progresses through **turn-based battles**, where each entity (player or monster) attacks in sequence until one is defeated.

### **What is a Turn-Based Game?**  
In this combat system, two sides - which are usually the player's side and the enemy's side - attack each other in turns. The side which is not attacking can perform actions to avoid or deflect the enemy's attack.

### **Core Mechanics:**  
✅ **Turn-based combat** – Players and monsters take turns attacking each other.  
✅ **Weapons system** – Each player and monster **must** have at least one weapon. (For extra points, students can implement multiple weapons per entity.)  
✅ **Character classes** – Players can choose from different warrior archetypes, such as **Knight, Assassin, or Wizard**, each with unique abilities.  
✅ **Monsters with special attacks** – Monsters like **Dragons, Goblins, and Skeletons** have distinct attack patterns.  
✅ **Damage system** – Each weapon deals a specific amount of damage, reducing the opponent’s health.  
✅ **Battle to the death** – The combat continues until one side is completely defeated.  

### **How the Game Works**  
1️⃣ The player selects a character class.  
2️⃣ A random monster opponent is generated.  
3️⃣ Both entities **take turns attacking** each other.  
4️⃣ The battle ends when one entity’s health reaches **zero**.  
5️⃣ (Optional) Players can switch weapons during combat if multiple weapons are implemented.  



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
2. Create a new branch named develop and switch to it.    


### 2️⃣ Step 2: Implement the Class Hierarchy 🌲  

- You must implement the class hierarchy as shown in the diagram below:  

![Class Hierarchy](resources/image.png)  

- Class Descriptions:  

<!-- todo -->

### 3️⃣ Step 3: Implement Player & Monster Methods 🏹  

Each class should have the appropriate attributes and methods.  

✅ **Basic Actions:**  
- **Attacking**: Players and monsters can attack their opponents.  
- **Defending** 🛡️: Reduce or block incoming damage. *(Implementing this action grants extra score!)*  
- **Being Killed**: When health reaches zero, the entity is defeated.  
- **Healing**: Players can heal, and some monsters (not all) have the ability to heal.  

✅ **Unique Abilities:**  
Each class of players and monsters has its own unique abilities:  

### **Players' Unique Abilities**  
- **Wizard** 🧙‍♂️: Can cast a **special spell** that **heals himself** while also **damaging the enemy**.  
- **Assassin** 🗡️: Can become **invisible**, making him **immune to enemy attacks** while dealing **increased damage** when attacking in this state.  
- **Knight** ⚔️: Can perform a **strong kick** that deals **extra damage** but can only be used **after a certain number of rounds** (cannot use it every turn).  

### **Monsters' Unique Abilities**  
- **Goblin** 👹: *[Unique ability to be determined]*  
- **Dragon** 🐉: Can **bypass shields**, damaging players even if they are defending. If there are **multiple players in the game** (extra score scenario), the dragon’s ability **damages all players simultaneously**.  
- **Skeleton** ☠️: Can **resurrect once** after being defeated, returning to battle with a portion of its health restored.  

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

java
while (player.isAlive() && enemy.isAlive()) {
    player.attack(enemy);
    if (enemy.isAlive()) {
        enemy.attack(player);
    }
}



### 5️⃣ Step 5: Extra Features & Bonus Tasks ⭐  
Want to **earn extra points**? Try implementing one of these:  

✅ **Defending Mechanic** 🛡️ *(Extra Score!)*  
- Implement a **defending action** that allows players to **block or reduce incoming damage**.  

✅ **Multiple Weapons System** ⚔️ *(Extra Score!)*  
- Players and monsters can **switch between different weapons** during combat instead of being limited to one.  

✅ **Multiple Players Mode** 👥 *(Extra Score!)*  
- Implement a **party-based battle system** where **multiple players** can fight against **monsters together**.  

✅ **Dragon’s Multi-Target Attack** 🐉 *(Extra Score!)*  
- If there are **multiple players in the battle**, the **dragon’s unique ability** should **damage all players simultaneously** instead of just one.  

✅ **(Bonus) Inventory System**  
- Allow players to **pick up and use items** like different classes of shields and more potions.  

✅ **(Bonus) Experience & Leveling System**  
- Players gain XP from battles and level up, increasing their **attack power**.  

✅ **(Bonus) PvP Mode**  
- Implement a **Player vs. Player** combat system.  

By implementing any of these extra features, you can earn additional points to boost your final score! 🚀  


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
