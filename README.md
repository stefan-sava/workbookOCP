🧠 Hands-On Workbook: Java Programming (Chapters 1–5)

A structured collection of Java exercises designed to practice control flow, OOP, and modern language features (Java 17+).
Each chapter focuses on key programming fundamentals — from loops and decision logic to inheritance, polymorphism, and interfaces.

📘 Chapters 1–3: Control Flow and Program Structure
🚗 Exercise 1 — Vehicle Speed Monitor
Scenario

Develop a vehicle monitoring system that:

Reads the vehicle type and speed continuously.

Classifies the vehicle (Car, Bus, Bike) and checks if it’s speeding.

Uses a switch expression with pattern matching.

Stops when a negative speed is entered.

Requirements

Use a while loop to request type and speed until a negative speed is entered.

Implement a switch expression with pattern matching:

Car → 100 km/h

Bus → 80 km/h

Bike → 60 km/h

Compare the speed to the limit using if statements.

Print:

✅ Speed OK

⚠️ Speeding!

❓ Unknown vehicle type

Stop gracefully when speed < 0.

Example Interaction
Enter vehicle type (Car, Bus, Bike): Car
Enter speed: 90
Speed OK
Enter vehicle type (Car, Bus, Bike): Bike
Enter speed: 75
Speeding!
Enter vehicle type (Car, Bus, Bike): Train
Enter speed: 100
Unknown vehicle type
Enter vehicle type (Car, Bus, Bike): Car
Enter speed: -1
Exiting system…

Starter Code
public class VehicleSpeedMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // your implementation here
    }
}

🔢 Exercise 2 — Grid Scanner with Labeled Breaks
Scenario

Given a 2D grid of chars, scan left-to-right, top-to-bottom to find the first digit ('0'..'9').
Stop scanning immediately once found. Skip cells with '#'.

Requirements

Use two nested for loops over char[][] grid.

Apply a label on the outer loop.

On '#', continue inner loop.

On digit found, break outer loop using the label.

Print the position or “none” if not found.

Input Grid
. . # .
a # b 2
. . . .

Expected Output
found digit '2' at (row=1, col=3)

Starter Code
public class GridScanner {
    public static void main(String[] args) {
        char[][] grid = {
            {'.', '.', '#', '.'},
            {'a', '#', 'b', '2'},
            {'.', '.', '.', '.'}
        };
        // your implementation here
    }
}

🎓 Exercise 3 — Student Grade Evaluator
Scenario

Build a console app that evaluates students’ grades and attendance.

Chapter 1: Program Structure

Package: school

Entry: public static void main(String[] args)

Use Scanner for input

Organize methods (calculateAverage, evaluateStudent, etc.)

Chapter 2: Operators & Data Types

Variables: scores, attendance, average, status

Demonstrate:

Arithmetic: +, /

Relational: >, <, >=

Logical: &&, ||

Ternary: ?:

Use correct types (int, double, boolean)

Show compound ops (+=, -=, ++, --)

Chapter 3: Decision & Loop Control

If/else logic:

average ≥ 70 && attendance ≥ 75 → Pass

average ≥ 50 && < 70 → Re-exam

Else → Fail

Switch expression → letter grade:

String grade = switch ((int) average / 10) {
    case 10, 9 -> "A";
    case 8 -> "B";
    case 7 -> "C";
    case 6 -> "D";
    default -> "F";
};


Loop for multiple students until “exit”.

Demonstrate continue and break.

Sample Output
Enter student name (or 'exit' to stop): Alice
Enter 3 test scores: 80 85 90
Enter attendance percentage: 92
Average: 85.0  Grade: B  → PASS

Enter student name (or 'exit' to stop): Bob
Enter 3 test scores: 55 60 58
Enter attendance percentage: 65
Average: 57.7  Grade: D  → RE-EXAM

Enter student name (or 'exit' to stop): exit
Program terminated.

📗 Chapters 4–5: Methods, Classes, and OOP Concepts
🌡️ Exercise 1 — Temperature Converter

Goal: Practice static methods and return types.

Class: TemperatureConverter

Methods:

static double toCelsius(double fahrenheit)
static double toFahrenheit(double celsius)


Ask user for input and call appropriate method.

💰 Exercise 2 — Bank Account Class

Goal: Encapsulation and validation.

Class: BankAccount

Private fields: accountNumber, owner, balance

Getters/setters with validation

Methods: deposit(double), withdraw(double)

Class: BankApp → create accounts and perform transactions.

➕ Exercise 3 — Method Overloading Playground

Goal: Demonstrate overloading.

int add(int a, int b)
double add(double a, double b)
double add(int a, double b)


Test with different argument types.

🧩 Exercise 4 — Pass-by-Value Demo

Goal: Understand Java parameter passing.

modify(String name) → won’t change original

modifyArray(int[] arr) → modifies array contents

🐾 Exercise 5 — Zoo Inheritance Model

Goal: Apply inheritance and polymorphism.

Animal → Mammal, Bird
Mammal → Dog
Bird → Eagle


Override makeSound() and demonstrate polymorphism using ArrayList<Animal>.

🔺 Exercise 6 — Shape Calculator

Goal: Abstract classes and method overriding.

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}


Subclasses: Circle, Rectangle, Triangle.

💳 Exercise 7 — Payment System Interface

Goal: Multiple interface implementation.

interface Payable { void pay(double amount); }
interface Refundable { void refund(double amount); }


Classes: CreditCard, PayPal, Crypto
Demonstrate interface-based polymorphism.

🚙 Exercise 8 — Sealed Classes: Transport Hierarchy

Goal: Explore sealed classes (Java 17+).

sealed class Transport permits Car, Bike, Bus {}


Attempting to extend from non-permitted class → compile error.

🧍 Exercise 9 — Records in Action

Goal: Use Java records.

record Person(String name, int age) {}


Create and print a list of persons.

Demonstrate immutability and auto-generated methods.

📚 Exercise 10 — Object Contract Verification

Goal: Override equals(), hashCode(), and toString().

Class: Book

Compare by ISBN

Demonstrate equality of different objects with same ISBN.

🧩 Concepts Covered

Control flow (if, switch, loops)

Pattern matching

Encapsulation & access modifiers

Inheritance, polymorphism

Abstract classes & interfaces

Sealed classes, records

Object contract (equals, hashCode, toString)

🧰 Tools & Environment

Language: Java 17+

IDE: IntelliJ IDEA / VS Code / Eclipse

Build: Maven or Gradle (optional)

Input: Console (Scanner)

Would you like me to make this look like a GitHub-ready README with emoji section headers, code syntax highlighting, and an automatic Table of Contents at the top (like a professional open-source repo)?

ChatGPT can make mistakes. OpenAI doesn't use Endava workspace data to train its model
