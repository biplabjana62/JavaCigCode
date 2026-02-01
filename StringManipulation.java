public class StringManipulation {
    public static void main(String[] args) {
     StringBuffer sb = new StringBuffer("Hello Biplab Jana");
     System.out.println("Original String: " + sb.toString()); 
     System.out.println("Length: " + sb.length());  
     System.out.println("Capacity: " + sb.capacity()); //### Default capacity is 16 + length of string
     System.out.println("Character position\n");
        for (int i = 0; i < sb.length(); i++) {
            System.out.println("Character at position " + i + ": " + sb.charAt(i));
        }
        String str = sb.toString();
        System.out.println("\nConverted to String: " + str);
        System.out.println("Index of 'Biplab': " + str.indexOf("Biplab"));
        // append
        sb.append(" - Welcome to Java Programming");
        System.out.println("\nAfter appending: " + sb.toString());
        
    }
}
