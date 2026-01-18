package JavaLab;

//4. Write a java program to find the largest number out of n natural numbers. college lab assignment
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): ");
        int n = sc.nextInt();
        LargestNumber ln = new LargestNumber();
        int largest = ln.findLargest(n, sc);
        System.out.println("The largest number is: " + largest);
        sc.close();
    }

    protected int findLargest(int n, Scanner sc) {
        int[] arr = new int[n];
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}