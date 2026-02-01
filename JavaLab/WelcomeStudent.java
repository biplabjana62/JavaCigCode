package JavaLab;

/*
3. Write a program to send the name and surname of a student through command line arguments and print a welcome message for the student.
 */
class WelcomeStudent {
    public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide name and surname as command line arguments.");
            return;
        }

        String name = args[0];
        String surname = args[1];

        System.out.println("Welcome, " + name + " " + surname + "!");
    }
}

/*
 * cd N:\JavaCigCode
 * javac JavaLab\WelcomeStudent.java
 * java JavaLab.WelcomeStudent Biplab Jana
 */