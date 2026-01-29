package WordManipulation;

public class SplitMethod {
    public static void main(String[] args) {
        String str = "Java is a programming  language.";
        String[] arr = str.split("[.\\s]+"); // split by space(s) and period
        // Print the resulting words
        // for (String word : arr) {
        //     System.out.println(word);
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
