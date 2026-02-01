package JavaLab;
/*
7. Write a Java program for sorting a given list of names in ascending order. */
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string size: ");
        int n = sc.nextInt(); // read the size of the string from the user
        sc.nextLine(); // <-- add this right after sc.nextInt() see explanation below
        String[] str = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        sc.close(); // close the scanner
        System.out.println("\nUnsorted strings:");
        for (String s : str) {
            System.out.println(s);
        }
        // Bubble sort algorithm to sort the strings in ascending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (str[j].compareToIgnoreCase(str[j + 1]) > 0) {
                    String temp = str[j]; // swap the characters
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted strings:");
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }

    }
}
