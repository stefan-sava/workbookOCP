Hands on workbook

------- Chapter 1-3:
 
Exercise 1: Vehicle Speed Monitor
Scenario:
You are developing a simple monitoring system for vehicles. The system must:
•	Continuously read the vehicle type and its current speed.
•	Classify the vehicle based on its type (Car, Bus, or Bike) and determine whether it is speeding.
•	Use a switch expression with pattern matching for type-based logic.
•	Stop monitoring when a negative speed value is entered.
•	Output a message for each input using decision statements (if, switch, and loops`).
 
Requirements:
Write a Java program that:
1.	Uses a while loop to repeatedly ask for a vehicle type and speed until the user enters a negative number for speed.
2.	Uses a switch expression that:
o	Matches on the vehicle type (String), using pattern matching where applicable.
o	Assigns a speed limit:
•	Car: 100 km/h
•	Bus: 80 km/h
•	Bike: 60 km/h
3.	Compares the input speed to the limit using an if statement.
4.	Prints:
o	"Speed OK" if within the limit.
o	"Speeding!" if above the limit.
o	"Unknown vehicle type" if the type doesn’t match any case.
5.	Terminates gracefully when speed < 0.
 
Example Input / Output:
 
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
 
 
public class VehicleSpeedMonitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
… }}
 
 
 


Exercise 2: Grid Scanner with Labeled Breaks
 
Scenario
given a 2D grid of chars, scan left-to-right, top-to-bottom to find the first digit ('0'..'9'). when found, stop all scanning immediately and print its position. skip (continue) any cell containing '#' (treated as a wall). if no digit is found, print "none".
 
Requirements
1.	use two nested for loops over char[][] grid.
2.	use a label on the outer loop.
3.	on '#', continue the inner loop only.
4.	on digit found, break the outer loop using the label.
5.	ensure indexes and control flow compile (watch for misplaced semicolons).
 
Input grid:
. . # .
a # b 2
. . . .
 
Output:
found digit '2' at (row=1, col=3)
 
public class GridScanner {
    public static void main(String[] args) {
        char[][] grid = {
            {'.', '.', '#', '.'},
            {'a', '#', 'b', '2'},
            {'.', '.', '.', '.'}
        };
…. }}
 






 
Exercise 3: Problem: Student Grade Evaluator
 
Scenario
your company needs a simple console app that evaluates students’ grades and attendance to determine whether they pass, fail, or require re-examination.
 
Requirements by Chapter
🔹 Chapter 1: Program Structure
1.	project organized in a school package.
2.	entry point: public static void main(String[] args)
3.	input handled through Scanner.
4.	comments & clear method separation (calculateAverage, evaluateStudent, etc.).
 
🔹 Chapter 2: Operators, Variables, Data Types
1.	declare variables for scores, attendance, average, and status.
2.	demonstrate:
o	arithmetic operators (+, /)
o	relational (>, <, >=)
o	logical (&&, ||)
o	ternary operator (?:) for quick decisions
3.	ensure correct data types (int, double, boolean); show type casting where needed.
4.	practice compound assignment (+=, -=) and increment/decrement.
 
🔹 Chapter 3: Decision & Loop Control
1.	if/else to check pass/fail logic:
o	average ≥ 70 and attendance ≥ 75 → Pass
o	average ≥ 50 and < 70 → Re-exam
o	otherwise → Fail
2.	pattern matching:
if (obj instanceof String name && !name.isEmpty()) { ... }
3.	use switch expression to convert numeric grade to letter:
String grade = switch((int)average/10) {
    case 10,9 -> "A";
    case 8 -> "B";
    case 7 -> "C";
    case 6 -> "D";
    default -> "F";
};
 
4.	loops:
•	ask for multiple students until user types "exit" (use while(true) with break).
•	or process an array of test scores using for-each.
5.	demonstrate continue (skip invalid input) and break (stop program).
 
Sample Interaction
 
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
 

 
------- Chapter 4 & 5:
 
Exercise 1: Temperature Converter
Goal: Practice static and instance methods + return types.
Requirements:
•	Create a class TemperatureConverter with:
o	A static method toCelsius(double fahrenheit)
o	A static method toFahrenheit(double celsius)
•	Create a main class that:
o	Prompts the user for temperature and unit.
o	Calls the appropriate method and prints the result.
Concepts:
Static methods, parameter passing, method overloading (optional), return values.
 
 
Exercise 2: BankAccount Class
Goal: Practice encapsulation, access modifiers, and instance methods.
Requirements:
•	Create a BankAccount class with:
o	Private fields: accountNumber, owner, balance
o	Getters and setters with validation (e.g., balance cannot be negative)
o	Methods: deposit(double), withdraw(double)
•	Create a BankApp class that creates several accounts and performs transactions.
Concepts:
Encapsulation, access control, mutators/accessors, input validation, this keyword.
 
 
Exercise 3: Method Overloading Playground
Goal: Demonstrate method overloading and parameter type conversion.
Requirements:
•	Create a Calculator class with overloaded methods:

int add(int a, int b)
double add(double a, double b)
double add(int a, double b)
•	Test them in main by calling with different parameter combinations.
Concepts:
Compile-time polymorphism (overloading), automatic promotion, return type handling.
 
 
Exercise 4: Pass-by-Value Demo
Goal: Show that Java uses pass-by-value, even for references.
Requirements:
•	Write a class PassByValueDemo that:
o	Has a method modify(String name) that tries to change the value of the String.
o	Has a method modifyArray(int[] arr) that changes an array element.
•	Observe how Strings are unaffected, but arrays change.
Concepts:
Parameter passing, reference vs primitive behavior.
 
 
Exercise 5: Zoo Inheritance Model
Goal: Apply inheritance and polymorphism.
Requirements:
•	Create a class hierarchy:
o	Animal → Mammal, Bird
o	Subclasses: Dog, Eagle
•	Each subclass overrides a method makeSound().
•	In main, store multiple animals in an ArrayList<Animal> and loop using polymorphism to call makeSound().
Concepts:
Inheritance, method overriding, polymorphism, instanceof checks.
 
 
Exercise 6: Shape Calculator
Goal: Practice abstract classes and overriding.
Requirements:
•	Create abstract class Shape with:
o	abstract double area()
o	abstract double perimeter()
•	Subclasses: Circle, Rectangle, Triangle
•	In main, create a list of shapes and print area/perimeter for each.
Concepts:
Abstract classes, abstract methods, dynamic method dispatch, List<Shape> polymorphism.
 
 
Exercise 7: Payment System Interface
Goal: Implement multiple interfaces and demonstrate polymorphism.
Requirements:
•	Define interfaces:

interface Payable { void pay(double amount); }
interface Refundable { void refund(double amount); }
•	Implement them in classes: CreditCard, PayPal, Crypto.
•	Write a processPayment(Payable p) method that calls p.pay() regardless of class type.
Concepts:
Interfaces, multiple inheritance, interface-based design, loose coupling.
 
 
Exercise 8: Sealed Classes — Transport Hierarchy
Goal: Use sealed classes and restricted inheritance (Java 17+).
Requirements:
•	Define a sealed class Transport permits Car, Bike, Bus
•	Create subclasses with their own properties.
•	Demonstrate how adding a non-permitted subclass fails to compile.
Concepts:
Sealed classes, permits keyword, compiler enforcement of hierarchy.
 
 
Exercise 9: Records in Action
Goal: Explore immutability and built-in methods of records.
Requirements:
•	Define a record Person(String name, int age)
•	Create and print a list of persons.
•	Override toString() (optionally use compact constructors).
Concepts:
Records, immutability, equals/hashCode auto-generation.
 
 
Exercise 10: Object Contract Verification
Goal: Practice equals(), hashCode(), and toString().
Requirements:
•	Create a Book class with isbn, title, author.
•	Override:
o	toString() for clean output
o	equals() and hashCode() to compare by isbn
•	Test equality of two different book objects with the same ISBN.
Concepts:
Object contract, overriding inherited methods, logical equality.
 

