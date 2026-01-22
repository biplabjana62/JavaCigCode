import java.util.Scanner;

public class SortName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the names: ");
        String str = sc.nextLine();
        sc.close();
        int lastIndex = str.lastIndexOf(' ');
        System.out.println("\n---------------------------------");
        System.out.print(Character.toUpperCase(str.charAt(0)) + ".");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') { // Character.isWhitespace(ch)
                if (lastIndex == str.charAt(i)) {
                    System.out.print(Character.toUpperCase(str.charAt(i + 1)) + ".");
                } else {
                    System.out.print(Character.toUpperCase(str.charAt(i + 1)));
                }
            }
        }
        System.out.println("\n---------------------------------");
        System.out.print(Character.toUpperCase(str.charAt(0)));
        for (int i = 0; i < lastIndex; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') { // Character.isWhitespace(ch)
                System.out.print(Character.toUpperCase(str.charAt(i + 1)) + ".");
            }
        }
        String searname = str.substring(lastIndex + 1);
        System.out.print(Character.toUpperCase(searname.charAt(0))+searname.substring(1).toLowerCase());


    }

}