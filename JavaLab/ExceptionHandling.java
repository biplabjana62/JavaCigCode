package JavaLab;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int i = sc.nextInt();
        System.out.print("Enter second value: ");
        int j = sc.nextInt();
        try {
            int result = i / j;
            System.out.println("The division is: " + result);
            throw new ArithmeticException("Manual Exception Thrown");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Execution Completed");
            sc.close();
        }
    }
}
// throw new ArithmeticException("Manual Exception Thrown");