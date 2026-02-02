package JavaLab;

import java.util.Scanner;

public class TextCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int charCount = Integer.MIN_VALUE;
        int wordCount = Integer.MIN_VALUE;
        int lineCount = Integer.MIN_VALUE;
        System.out.println(charCount);
        System.out.println("Enter the text (type 'END' on a new line to finish):"); 
        StringBuilder text = new StringBuilder();
        while (true) {
            String line = sc.nextLine();
            if (line.equals("END")) {
                break;
            }
            text.append(line).append("\n"); /*  Append the line and a newline character  -> Is exactly the same as: text.append(line); text.append('\n');*/
        }
        String fullText = text.toString();
        charCount = fullText.length();
        String[] words = fullText.trim().split("\\s+"); // Splits on spaces & newlines
        wordCount = words.length;
        String[] lines = fullText.split("\n");
        lineCount = lines.length;
        System.out.println("Character Count: " + (charCount - lineCount)); // Subtracting newlines from char count
        System.out.println("Word Count: " + wordCount);
        System.out.println("Line Count: " + lineCount);
        sc.close();

    }
}
