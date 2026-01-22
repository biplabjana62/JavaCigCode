import java.util.Scanner;

public class BubbleStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string size: ");
        int n = sc.nextInt(); // read the size of the string from the user
        sc.nextLine(); // <-- add this right after sc.nextInt() see explanation below
        String[] str = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        sc.close(); // close the scanner
        System.out.println("\nUnsorted strings:");
        for (String s : str) {
            System.out.println(s);
        }
        // Bubble sort algorithm to sort the strings in ascending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (str[j].compareToIgnoreCase(str[j + 1]) > 0) {
                    String temp = str[j]; // swap the characters
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted strings:");
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }

    }
}
/*
 * Great question!
 * 
 * This line:
 * 
 * ```java
 * sc.nextLine(); // consume the leftover newline
 * ```
 * 
 * is very important when you're mixing `nextInt()` and `nextLine()` in Java's
 * `Scanner`.
 * 
 * ---
 * 
 * ### ⚠️ What’s the issue?
 * 
 * When you use:
 * ```java
 * int n = sc.nextInt();
 * ```
 * 
 * - It reads only the **integer**, not the newline character (`\n`) that you
 * press after entering the number.
 * - So after `nextInt()`, the newline is **still in the input buffer**.
 * 
 * Then, when you immediately do:
 * ```java
 * str[i] = sc.nextLine();
 * ```
 * 
 * - This `nextLine()` sees the leftover newline (`\n`) from the previous input
 * and thinks it's a blank line.
 * - So it reads **an empty string** (`""`), not the actual user input.
 * 
 * ---
 * 
 * ### ✅ Why `sc.nextLine();` fixes it:
 * 
 * This line:
 * 
 * ```java
 * sc.nextLine();
 * ```
 * 
 * - Reads and **discards** the leftover newline from the input buffer.
 * - So when your next `sc.nextLine()` runs, it works correctly and waits for
 * real user input.
 * 
 * ---
 * 
 * ### 🔍 Analogy:
 * 
 * Imagine you're passing a ball (`nextInt()`), but the string (`nextLine()`) is
 * waiting in line. If someone drops a wrapper (the newline) in between, the
 * string trips over it and falls flat (reads an empty string). You're just
 * cleaning the path first with `sc.nextLine();`.
 * 
 * ---
 * 
 * Would you like a quick demo of this with input/output examples to visualize
 * the problem better?
 */
/*
 * Ah, this is an **excellent question**—and it's one that every Java learner
 * asks at some point! You're asking about the difference between:
 * 
 * ```java
 * str.length // (used for arrays)
 * ```
 * vs
 * ```java
 * str.length() // (used for Strings)
 * ```
 * 
 * ---
 * 
 * ## 🔍 Full Explanation: `length` vs `length()`
 * 
 * ### 1️⃣ `length` (with no parentheses)
 * 
 * - This is a **field** (variable) in **arrays**.
 * - It tells you how many **elements** are in the array.
 * - It's **not a method**, so you don't use parentheses.
 ** 
 * Example:**
 * ```java
 * String[] str = new String[5];
 * System.out.println(str.length); // Output: 5
 * ```
 * 
 * Used in your **BubbleStr** program:
 * ```java
 * for (int i = 0; i < str.length - 1; i++) { ... }
 * ```
 * 
 * - `str` is a **String array**, like: `["apple", "banana", "grape"]`
 * - So `str.length` gives how many strings are in the array (i.e., 3)
 * 
 * ---
 * 
 * ### 2️⃣ `length()` (with parentheses)
 * 
 * - This is a **method** of the **String class**.
 * - It returns the **number of characters** in a String.
 * - Use it with parentheses because it's a method call.
 ** 
 * Example:**
 * ```java
 * String s = "India";
 * System.out.println(s.length()); // Output: 5
 * ```
 * 
 * Used in your **ReverseEachWord** program:
 * ```java
 * for (int i = 0; i < str.length(); i++) { ... }
 * ```
 * 
 * - `str` is a **String**, like `"I Love My India"`
 * - So `str.length()` gives the number of characters in the string (including
 * spaces)
 * 
 * ---
 * 
 * ## 🔁 Summary Table
 * 
 * | Feature | `str.length` | `str.length()` |
 * |---------------------|--------------------------|---------------------------
 * --|
 * | Belongs to | Arrays | String objects |
 * | Type | Field (no parentheses) | Method (with parentheses) |
 * | Returns | Number of elements | Number of characters |
 * | Example | `str.length` → 5 | `"India".length()` → 5 |
 * 
 * ---
 * 
 * ## ✅ How to remember
 * 
 * > 🔹 If it's a **String**, use `length()`
 * > 🔹 If it's an **array**, use `length`
 * 
 * ---
 * 
 * ### ✨ Bonus Tip
 * 
 * Java is a strictly-typed language, so methods and properties are not reused
 * across unrelated types. Arrays and Strings are totally different objects
 * internally—so while they **both deal with "length"**, they do it differently.
 * 
 * Would you like a visual diagram of how arrays and strings are stored in
 * memory to understand this better?
 */