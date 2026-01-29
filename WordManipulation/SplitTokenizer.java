package WordManipulation;
import java.util.StringTokenizer;

public class SplitTokenizer {
    public static void main(String[] args) {
        String str = "Java is a programming  language.";
        StringTokenizer st = new StringTokenizer(str, " ."); // tokenize by space and period
        // it ha two constructors
        // StringTokenizer st = new StringTokenizer(str); // default delimiter is space, tab, newline, carriage return, form feed
        //and StringTokenizer st = new StringTokenizer(str, " ."); // custom delimiters 

        while (st.hasMoreTokens()) { // check if more tokens are available
            System.out.println(st.nextToken());// print each token
        }

    }
}
