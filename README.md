# Design-Pattern

Singleton Design Pattern Example
This repository demonstrates the Singleton design pattern in Java using the example of a CEO class.

Importance of Singleton Design Pattern
The Singleton design pattern ensures that only one instance of a class exists throughout the application. This pattern offers several benefits:

Resource Efficiency: It prevents the creation of multiple instances, saving memory and other resources.
Global Access: It provides a central point to access the single instance, making it convenient for other parts of the application to interact with it.
Control: It can be useful in scenarios where a specific behavior or control is desired for a single class instance (e.g., CEO, logger, database connection pool).
Code Structure
The repository contains two main files:

CEO.java: Defines the CEO class with Singleton implementation.
SingletonAPP.java: Demonstrates how to use the Singleton CEO class in a program.
CEO Class (CEO.java)
This class represents the CEO of a company. It implements the Singleton design pattern for creating and accessing a single instance:

Private fields store CEO attributes like name and salary.
Static reference ref holds the Singleton instance.
getInstance(String name, long salary) is a static method used to get the CEO instance. It implements lazy initialization, creating the instance only when requested.
Private constructor prevents direct object creation from outside the class.
Overloaded private constructor (not used in this example) reinforces the Singleton pattern.
Getter and setter methods for CEO attributes (name and salary).
Methods like bringBussiness(), takeLeaves(), attendMetting() simulate CEO actions.
SingletonAPP Class (SingletonAPP.java)
This class demonstrates how to use the Singleton CEO class:

It gets a single instance of CEO using CEO.getInstance("Akash", 5000000).
The CEO performs actions like bringBussiness(), takeLeaves(), attendMetting().
It attempts to create another CEO instance with different parameters (CEO.getInstance("Omkar", 6000000)) but gets the existing instance due to Singleton behavior.
Finally, it verifies that both references point to the same instance, demonstrating the Singleton principle.
Running the Program
Clone this repository locally.
Compile the Java files using a Java compiler (e.g., javac CEO.java SingletonAPP.java).
Run the program using java SingletonAPP.
