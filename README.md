### 🚀 Java Basics Project

Welcome to the Java Basics Project! 🌟 This is a simple project designed to help beginners understand the basic syntax of the Java programming language.

<p align="center"> <img src="https://user-images.githubusercontent.com/123456789/123456789-12345678-9a00-46ef-8d9f-98f12345678b.gif" alt="Java Logo" width="200"/> </p>

### 📋 Table of Contents

1. Introduction
2. Prerequisites
3. Project Structure
4. Basic Java Syntax

- 1. Variables
- 2. Data Types
- 3. Operators
- 4. Control Flow
- 5. Methods
- 6. Classes and Objects

5. Running the Project
6. License

### 🧑‍💻 Introduction

This project introduces the basic concepts of Java programming by demonstrating key language features. Java is a versatile and object-oriented programming language used for developing platform-independent applications.

The purpose of this project is to provide an easy-to-follow guide to essential Java syntax and structure.

### 🔧 Pre- requisites

Before you start, ensure you have the following installed:

🟦 JDK (Java Development Kit) (version 11 or higher)
🟩 A Java IDE (e.g., Eclipse, IntelliJ IDEA, VSCode)
🗂️ Project Structure

```bash
JavaBasicsProject/
│
├── src/
│ └── Main.java // The main class where examples of basic syntax are presented.
├── README.md // Project description and syntax guide.
└── .gitignore // Files to be ignored by git.

```

### 📚 Basic Java Syntax

### 1️⃣ Variables

In Java, variables are containers that hold data values. A variable must be declared before it can be used.

```bash

int number = 10; // Integer variable
String name = "Java"; // String variable

```

### 2️⃣ Data Types

Java has two categories of data types:

Primitive types: int, char, boolean, double, etc.
Reference types: Objects and arrays.

```bash
boolean isJavaFun = true;
double temperature = 36.6;
```

### 3️⃣ Operators

Java supports arithmetic, relational, and logical operators.

```bash
int sum = 5 + 10; // Arithmetic
boolean isEqual = (5 == 5); // Relational
boolean result = (5 > 3) && (10 < 20); // Logical

```

### 4️⃣ Control Flow

Control flow statements manage the order in which instructions are executed.

### 🔹 If-Else Statement:

```bash
if (number > 0) {
System.out.println("Positive number");
} else {
System.out.println("Negative number");
}
```

### 🔹 For Loop:

```bash
for (int i = 0; i < 5; i++) {
System.out.println(i);
}

```

### 5️⃣ Methods

A method is a block of code that performs a specific task. In Java, every program must have a main method where execution begins.

```bash
public static void sayHello() {
System.out.println("Hello, World!");
}

```

### 6️⃣ Classes and Objects

Java is an object-oriented language where classes are blueprints for objects.

```bash

public class Dog {
String name;
int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println(name + " is barking.");
    }

}

// Creating an object
Dog myDog = new Dog("Buddy", 3);
myDog.bark(); // Outputs: Buddy is barking.

```

### ▶️ Running the Project

To run the project, follow these steps:

1.Clone this repository:
bash

```bash
git clone https://github.com/yourusername/JavaBasicsProject.git
```

2.Open the project in your preferred IDE.
3.Navigate to the src/Main.java file.
4.Run the file. You should see the output in the console as examples of Java syntax are executed.

### 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

## Extra Additions:

- Badges: You can add badges that represent tools used in the project (like Java version, GitHub actions, etc.)

```bash
![Java](https://img.shields.io/badge/Java-11-blue)
![Spring](https://img.shields.io/badge/SpringBoot-2.5.4-green)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow)`
```

- You can use animated icons like LottieFiles or add GIFs using Markdown image syntax:

![Java Animation](https://user-images.githubusercontent.com/123456789/animation.gif)
