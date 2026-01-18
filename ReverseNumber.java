import java.util.Random;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Random sc = new Random();
        System.out.print("Enter the range: ");
        int range = ob.nextInt();
        for (int i = 1; i <= range; i++) {
            int number = sc.nextInt(1, 5000);
            methodnnumberPalindrome(number);
        }
        ob.close();
    }

    public static int methodReverse(int num) {
        int rem = 0, sum = 0;
        while (num != 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        return sum;
    }

    public static int methodnnumberPalindrome(int num) {
        int reversed = methodReverse(num);
        if (reversed == num) {
            System.out.println(num + " is a Palindrome number.***##");
        }
        // else {
        // System.out.println(num + " is not a Palindrome number.");
        // }
        return reversed;
    }
}
