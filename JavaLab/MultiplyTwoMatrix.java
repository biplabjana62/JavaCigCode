package JavaLab;

import java.util.Scanner;
import java.util.Random;
// 6. Write a java program to multiply two given matrices.
public class MultiplyTwoMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gen = new Random();
        System.out.print("Enter number of rows for first matrix: ");
        short r1 = sc.nextShort();
        System.out.print("Enter number of columns for first matrix: ");
        short c1 = sc.nextShort();
        System.out.print("Enter number of rows for second matrix: ");
        short r2 = sc.nextShort();
        System.out.print("Enter number of columns for second matrix: ");
        short c2 = sc.nextShort();
        sc.close();
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible with given dimensions.");
            System.exit(0);
        }
        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];
        int[][] result = new int[r1][c2];
        System.out.println("First Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = gen.nextInt(10);
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = gen.nextInt(10);
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.err.println("Resultant Matrix after Multiplication:\n");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
