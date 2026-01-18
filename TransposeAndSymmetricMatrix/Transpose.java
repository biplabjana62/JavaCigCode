package TransposeAndSymmetricMatrix;

import java.util.Scanner;
import java.util.Random;

class Transpose {
    Scanner sc = new Scanner(System.in);
        Random gen = new Random();
    protected void isTranspose() {

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        //sc.close();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enterd the elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = gen.nextInt(1, 51);
                System.out.print(matrix[i][j] + " ");
            }
            IO.println();
        }
        System.out.println("The Transpose matrix is : ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            IO.println();
        }
    }
    protected void checkSymmetric(){
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        sc.close();
        if(rows != cols){
            System.out.println("Matrix is not symmetric");
            return;
        }
        int[][] matrix = new int[rows][cols];
        System.out.println("Enterd the elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = gen.nextInt(1, 51);
                System.out.print(matrix[i][j] + " ");
            }
            IO.println();
        }
        boolean isSymmetric = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] != matrix[j][i]){
                    isSymmetric = false;
                    break;
                }
            }
        }
        if(isSymmetric){
            System.out.println("Matrix is symmetric");
        } else {
            System.out.println("Matrix is not symmetric");
        }
    }
}

