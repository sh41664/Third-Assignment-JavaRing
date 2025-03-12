# Third-Assignment-JavaRing
A turn-based RPG inspired by Souls-like games which can be run in terminal

# **Java-Ring** 🎮  

### **Introduction**  
Welcome to your weekly programming assignment! In this project, you will build a **text-based role-playing game (RPG)** using **Object-Oriented Programming (OOP) principles**, including **inheritance, polymorphism, and interfaces**. Your task is to implement a class hierarchy for different game entities, including **players and monsters**, each with unique abilities and attributes.  

By the end of this project, you will have a **functional game system** where players can **fight monsters in a turn-based combat system**, reinforcing your understanding of **OOP design** in a practical way.  

---

## **📌 Learning Objectives**  
Through this assignment, you will:  
✅ Learn and apply **inheritance** to structure a game class hierarchy.  
✅ Understand and implement **interfaces** and **abstract classes**.  
✅ Use **polymorphism** to handle interactions between game entities.  
✅ Practice **code reusability** and **modularity** in Java/Python.  
✅ Develop a **terminal-based game** that showcases OOP concepts.  

---

## **📝 Assignment Tasks**  

### **1️⃣ Step 1: Fork & Setup 🍴**  
1. **Fork** this repository and clone it to your local machine.  
2. Create a new branch named `develop` and switch to it.  
3. Set up your project structure in your preferred language (Java/Python).  

---

### **2️⃣ Step 2: Implement the Class Hierarchy 🌲**  

🔹 You must implement the class hierarchy as shown in the diagram below:  

![Class Hierarchy](resources/image.png)  

🔹 **Class Descriptions:**  

#### **🔵 GameObject (Interface)**  
- Every entity in the game is a **GameObject**.
- It contains the following methods:
  - `attack(GameObject target)`: Allows an entity to attack another entity.
  - `takeDamage(int damage)`: Reduces an entity’s health when attacked.
  - `die()`: Handles what happens when an entity's health reaches 0.

#### **🟢 Monster (Abstract Class)**  
- **Attributes**: `health`, `attackPower`, `isAlive`  
- **Subclasses**:
  - **Goblin**: A basic monster with no special abilities.
  - **Dragon**: Can breathe fire, damaging multiple players.
  - **Skeleton**: Has a unique ability to revive once after dying.

#### **🔴 Player (Abstract Class)**  
- **Attributes**: `playerName`, `health`, `attackPower`  
- **Subclasses**:
  - **Assassin**: Can become invisible and land critical hits.
  - **Knight**: Has armor to reduce incoming damage.
  - **Wizard**: Can cast spells to damage enemies or heal allies.  

🔹 You **must use inheritance correctly** and **override methods** where necessary.  

---

### **3️⃣ Step 3: Implement Player & Monster Methods 🏹**  

Each class should have the appropriate attributes and methods.  

✅ **Basic Actions:**  
- Players and monsters should be able to **attack** each other using their `attack()` method.  
- Entities should **take damage** and lose health when attacked.  
- When an entity’s health reaches `0`, the `die()` method should be triggered.  

✅ **Unique Abilities:**  
- **Assassin**: Gains invisibility and deals **critical hits** when attacking while invisible.  
- **Knight**: Has **armor** that reduces incoming damage.  
- **Wizard**: Can **cast spells** to heal teammates or damage enemies.  
- **Dragon**: Has a **fire-breathing** attack that damages multiple players.  
- **Skeleton**: **Revives once** after dying.  

🔹 Make sure each entity **prints messages** when performing actions:  
```bash
Arthur (Knight) attacked Goblin!
Goblin took 15 damage!
Goblin has 35 health remaining.
```

---

### **4️⃣ Step 4: Implement the Game Loop 🎮**  
Create a simple **turn-based combat system** in a main game loop:  

1. **Players choose a character (Assassin, Knight, or Wizard).**  
2. **A random monster (Goblin, Dragon, or Skeleton) is generated.**  
3. **The player and the monster take turns attacking each other.**  
4. **Game ends when either the player or the monster dies.**  

🔹 Example game loop structure:  
```python
while player.isAlive() and monster.isAlive():
    player.attack(monster)
    if monster.isAlive():
        monster.attack(player)
```

---

### **5️⃣ Step 5: Extra Features & Bonus Tasks ⭐**  
Want to **earn extra points**? Try implementing one of these:  

✅ **(Optional) Inventory System**:  
- Allow players to **pick up and use items** like health potions or weapons.  

✅ **(Optional) Experience & Leveling System**:  
- Players gain XP from battles and level up, increasing their **attack power**.  

✅ **(Optional) Multiple Players**:  
- Let players form a **party** and fight monsters together.  

✅ **(Bonus) PvP Mode**:  
- Implement a **Player vs. Player** combat system.  

---

## **🔍 Grading Criteria 🏆**  
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

---

## **💡 Submission Guidelines**  
✅ **Deadline**: Submit your assignment before **[insert deadline]**.  
✅ **Submission Format**:  
1. Push your code to **your forked repository**.  
2. Create a **pull request** to the main repository.  
3. Include a **README.md** with explanations of your implementation.  

📌 **Note:** Late submissions may receive **deductions**!  

---

## **🚀 Tips for Success**  
💡 **Follow OOP principles**: Avoid redundant code by using inheritance properly.  
💡 **Test your code**: Run different scenarios to ensure everything works as expected.  
💡 **Ask for help**: If you're stuck, reach out to your classmates or TAs.  

🎯 **Your goal is not just to complete the assignment but to learn and apply OOP effectively!**  

**Good luck, and have fun coding!** 🚀
