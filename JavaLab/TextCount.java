package JavaLab;

import java.util.Scanner;

public class TextCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initialize counts
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        System.out.println("Enter the text (type 'END' on a new line to finish):");

        // Read multiple lines
        StringBuilder text = new StringBuilder();
        while (true) {
            String line = sc.nextLine();
            if (line.equals("END")) {
                break;
            }
            text.append(line).append("\n"); // Add newline to preserve lines
        }

        String fullText = text.toString();

        // Character count includes all characters including newlines
        charCount = fullText.length();

        // Word count: split by whitespace, handle empty input
        if (fullText.trim().isEmpty()) {
            wordCount = 0;
        } else {
            wordCount = fullText.trim().split("\\s+").length;
        }

        // Line count
        lineCount = fullText.split("\n").length;

        // Print results
        System.out.println("Character Count: " + charCount);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Line Count: " + lineCount);

        sc.close();
    }
}