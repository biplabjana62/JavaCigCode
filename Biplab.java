class Biplab {
        public static void main(String args[]) throws Exception {
                System.out.println(args[0]);

                int n = Integer.parseInt(args[0]);
                try {
                        if ((n % 3) == 0) {
                                if ((n % 2) != 0) {
                                        System.out.println("The number is divisible by 3 but not divisible 2");
                                } else {
                                        System.out.println("The number is divisible by 3 and 2");
                                }
                        } else {
                                System.out.println("The number is not divisible by 3");
                        }
                } catch (Exception e) {
                        System.out.println("Please provide a valid integer as command line argument.");
                }
        }
}
