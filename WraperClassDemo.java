public class WraperClassDemo {
    public static void main(String[] args) {
        int num = 42;
        // Boxing: Converting primitive to wrapper object
        // Integer num1 = Integer.valueOf(num); // Boxing
        Integer num1 = num; // Autoboxing
        System.out.println("Wrapped Integer: " + num1);
        // Unboxing: Converting wrapper object back to primitive
        /*
         * Auto-unboxing: wrapper to primitive
         * int num2 = num1;
         */
        int num2 = num1.intValue(); // Unboxing
        System.out.println("Unboxed Integer: " + num2);

        String str = "123";
        // Converting String to Integer (wrapper)
        int parsedNum = Integer.parseInt(str);
        System.out.println("Parsed Integer from String: " + parsedNum);
    }
}
