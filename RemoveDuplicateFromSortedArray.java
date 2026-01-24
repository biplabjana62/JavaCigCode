import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gen = new Random();
        System.out.print("Enter array length: ");
        int len = sc.nextInt();
        sc.close();
        int[] arr = new int[len];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < len; i++) {
            arr[i] = gen.nextInt(1, 50);
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nSorted array");
        System.out.println(Arrays.toString(arr));
        System.out.println("After remove diplicate elements: ");
        int k = 0;
        for (int i = 1; i < len; i++) {
            if (arr[k] != arr[i]) {
                k++;
                arr[k] = arr[i];
            }
        }
        for (int i = 0; i <= k; i++) {
            System.out.print(arr[i] + " ");
        }
        // System.out.println(Arrays.toString(Arrays.copyOf(arr, k + 1)));?
    }
}
/*
 * What this line does (step by step)
 * Arrays.copyOf(arr, k + 1)
 * 
 * Creates a new array
 * 
 * Copies elements from index 0 to k (inclusive)
 * 
 * Length of new array = k + 1
 * 
 * This includes only unique elements
 */