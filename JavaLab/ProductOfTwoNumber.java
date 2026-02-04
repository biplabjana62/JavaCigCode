package JavaLab;

import java.util.Scanner;

public class ProductOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        var num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        var num2 = sc.nextDouble();
        var product = num1 * num2;
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        sc.close();
    }
}
