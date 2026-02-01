public class ThisConstructor {
    ThisConstructor() {
        this(10); // Calling parameterized constructor
        System.out.println("Default Constructor");
    }

    ThisConstructor(int x) {
        this(3, 4); // Calling another constructor
        System.out.println("Parameterized Constructor with value: " + x);
    }

    ThisConstructor(int a, int b) {
        this(5, 9, 7); // Calling default constructor
        System.out.println("Constructor with String: " + a + ", " + b);
    }

    ThisConstructor(int a, int b, int c) {
        System.out.println("Constructor with three integers: " + a + ", " + b + ", " + c);
    }

    @Override
    public String toString() {
        return "program demonstrating 'this' constructor calls";
    }

    public static void main(String[] args) {
        ThisConstructor obj1 = new ThisConstructor(); // Calls default constructor
        System.out.print(obj1);

    }
}
/*
 * output:
 * Constructor with three integers: 5, 9, 7
 * Constructor with String: 3, 4
 * Parameterized Constructor with value: 10
 * Default Constructor
 * PS N:\JavaCigCode>
 */
