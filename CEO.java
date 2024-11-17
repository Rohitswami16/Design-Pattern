
// CEO.java
// Singleton Class Implementation
// Importance of Singleton Design Pattern:
// 1. Ensures a single instance of the class is created, saving resources.
// 2. Provides a global point of access to the instance.
// 3. Useful for scenarios where exactly one instance is needed (e.g., CEOs, loggers, database connections).

public class CEO {

    // Private fields for CEO attributes
    private String name;
    private long salary;

    // Static reference to hold the single instance of CEO
    private static CEO ref;

    /**
     * Static method to get the single instance of the CEO class.
     * Implements Lazy Initialization: The instance is created only when required.
     */
    public static CEO getInstance(String name, long salary) {
        if (ref == null) {
            // Create the instance if it does not already exist
            ref = new CEO(name, salary);
        }
        return ref; // Return the single instance
    }

    // Private constructor to restrict object creation from outside the class
    private CEO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    // Overloaded private constructor (not used in this example, kept for clarity)
    private CEO() {
    }

    // Getter for CEO name
    public String getName() {
        return name;
    }

    // Setter for CEO name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for CEO salary
    public long getSalary() {
        return salary;
    }

    // Setter for CEO salary
    public void setSalary(long salary) {
        this.salary = salary;
    }

    // Method for CEO to bring business
    void bringBussiness() {
        System.out.println(name + " is bringing new business to the company");
    }

    // Method for CEO to take leaves
    void takeLeaves() {
        System.out.println(name + " is taking leaves");
    }

    // Method for CEO to attend meetings
    void attendMetting() {
        System.out.println(name + " is attending a kickoff meeting");
    }
}
