package JavaLab;

import java.util.Scanner;
// 8. Write a Java program that checks whether a given string is a palindrome or not. college lab
public class Stringpalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();
        StringBuilder sb = new StringBuilder(input);
        Stringpalindrom sp = new Stringpalindrom();
        if (sp.isPalindrome(sb.toString())) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }

    protected boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
