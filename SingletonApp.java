
// SingletonAPP.java
// Demonstrating the Singleton Design Pattern in Java
// Purpose: To ensure only one instance of the CEO class is created throughout the application, 
// maintaining a single point of control for global access.

public class SingletonAPP {

 public static void main(String[] args) {

     // Create a single instance of CEO with specific attributes
     CEO ref = CEO.getInstance("Akash", 5000000);
     ref.bringBussiness(); 
     ref.takeLeaves();     
     ref.attendMetting();  

     // Attempt to create another CEO instance with different parameters
     // Singleton ensures this will not create a new object; it will return the existing instance
     CEO ref1 = CEO.getInstance("Omkar", 6000000);
     ref1.bringBussiness();
     ref1.takeLeaves();
     ref1.attendMetting();

     // Verifying Singleton Property:
     // Check if both references point to the same instance
     System.out.println(ref == ref1); // Output will be true as Singleton enforces a single instance
 }
}

// Expected Output:

// Akash is bringing new business to the company
// Akash is taking leaves
// Akash is attending a kickoff meeting
// Akash is bringing new business to the company
// Akash is taking leaves
// Akash is attending a kickoff meeting
// true

