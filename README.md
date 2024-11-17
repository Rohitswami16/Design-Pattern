# Design-Pattern
## Singleton Design Pattern Example
### Overview

This repository demonstrates the Singleton Design Pattern in Java, using the example of a CEO class. The Singleton pattern ensures that only one instance of a class exists throughout the application, maintaining a single point of control.

-----------------------------------------------------------------------------------------------
## Importance of the Singleton Design Pattern

The Singleton Design Pattern is widely used in software development for scenarios where a single instance of a class is sufficient and efficient. Key benefits include:

#### Resource Efficiency
Prevents the creation of multiple instances, conserving memory and other system resources.
#### Global Access
Provides a centralized point to access the instance, ensuring consistency across the application.
#### Control
Facilitates behavior management for single-instance classes like CEOs, loggers, and database connection pools.

---------------------------------------------------------------------------------------------

## Code Structure
The repository contains two main files:

### 1. CEO.java
Defines the CEO class and implements the Singleton pattern:

#### Attributes: Private fields to store CEO details like name and salary.
#### Singleton Logic:
A static reference ref holds the single instance of the class.
The getInstance(String name, long salary) method ensures lazy initialization and provides access to the instance.
Private constructors prevent direct instantiation from outside the class.
#### Methods:
bringBussiness(): Simulates bringing business to the company.
takeLeaves(): Simulates taking leaves.
attendMetting(): Simulates attending meetings.
Getters and setters for attributes like name and salary.
### 2. SingletonAPP.java
Demonstrates the Singleton CEO class in action:

Retrieves a single instance of the CEO using CEO.getInstance("Akash", 5000000).
Calls CEO methods like bringBussiness(), takeLeaves(), and attendMetting().
Attempts to create another CEO instance (CEO.getInstance("Omkar", 6000000)), which returns the existing instance due to Singleton behavior.
Verifies that both references (ref and ref1) point to the same instance.

-----------------------------------------------------------------------------------------------

## How to Run the Program
Follow these steps to run the program locally:

### Clone the Repository

git clone https://github.com/your-username/singleton-design-pattern-example.git
cd singleton-design-pattern-example

### Compile the Java Files
Ensure you have a Java compiler installed. Compile the files:

javac CEO.java SingletonAPP.java

### Run the Program
Execute the compiled program:

java SingletonAPP
------------------------------------------------------------------------------------------------
### Output
Observe the actions of the CEO and verify the Singleton behavior. The program will confirm that only one instance is created and shared.

### Example Output

Akash is bringing new business to the company

Akash is taking leaves

Akash is attending a kickoff meeting

Akash is bringing new business to the company

Akash is taking leaves

Akash is attending a kickoff meeting

true

------------------------------------------------------------------------------------------------
## Key Concepts Demonstrated

Singleton Design Pattern: Ensures a single instance of a class.
Lazy Initialization: Instance is created only when requested.
Encapsulation: Private fields and constructors ensure controlled access.

------------------------------------------------------------------------------------------------
## Contributing
Contributions are welcome! If you find a bug or have an idea to enhance the project:

Fork the repository.
Create a new branch for your changes.
Submit a pull request with a clear explanation of your changes.
