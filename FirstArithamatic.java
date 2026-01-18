import java.util.Scanner;

public class FirstArithamatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value :");
        var a = sc.nextInt();
        System.out.print("Enter second value :");
        int b = sc.nextInt();
        sc.close();
        System.out.println("The sum is :" + (a + b));
    }

}