package JavaLab;

import java.util.Scanner;
import java.util.Random;

// 9. Write a java program to read n number of values in an array and display it in reverse order.
public class ReverseDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gen = new Random();
        System.out.print("Enter the number length if array: ");
        int n = sc.nextInt();
        sc.close();
        int[] arr = new int[n];
        System.out.println("Array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = gen.nextInt(100); // Generating random integers between 0 and 99
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray elements in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
