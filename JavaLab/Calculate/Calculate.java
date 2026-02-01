package JavaLab.Calculate;

/*
10. Write a Java program to perform mathematical operations. Create a class called AddSub with methods to add and subtract. Create another class called MulDiv that extends from  AddSub class to use the member data of the super class. MulDiv should have methods to multiply and divide A main function should access the methods and perform the mathematical operations.*/
import java.util.Scanner;

class AdditionSubtraction {
    public double calAdd(double a, double b) {
        return a + b;
    }

    public double calSub(double a, double b) {
        return a - b;
    }
}

class MultiplayDivision extends AdditionSubtraction {
    public double calMul(double a, double b) {
        return a * b;
    }

    public double calDiv(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero");
            return 0;
        }
    }

}

public class Calculate {
    public static void main(String[] args) {
        MultiplayDivision md = new MultiplayDivision();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        sc.close();
        System.out.println("Addition: " + md.calAdd(num1, num2));
        System.out.println("Subtraction: " + md.calSub(num1, num2));
        System.out.println("Multiplication: " + md.calMul(num1, num2));
        System.out.println("Division: " + md.calDiv(num1, num2));

    }
}
/*
 * // To Compile and Run the Program:
 * cd N:\JavaCigCode
 * javac JavaLab\Calculate\Calculate.java
 * java JavaLab.Calculate.Calculate
 * 
 */