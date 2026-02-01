package JavaLab;
// 2. Write a program to print the square of a number passed through command line arguments.
public class SquareNumber {
    public static void main(String[] args) {
        if (args.length ==0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }
        int number = Integer.parseInt(args[0]);
        int square = number * number;
        System.out.println("The square of " + number + " is: " + square);
    }
}
/*
to compile 
cd N:\JavaCigCode
javac JavaLab/SquareNumber.java
to run
java JavaLab.SquareNumber 5
 */
