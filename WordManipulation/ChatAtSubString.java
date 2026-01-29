package WordManipulation;

public class ChatAtSubString {
    public static void main(String[] args) {
        String str ="This is a Cat.";
        String word;
        int start=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' '|| ch =='.') {
                word = str.substring(start,i);
                start = i + 1;
                System.out.println(word);
            }
        }
    }
}
