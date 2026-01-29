package JavaLab;

/*
11. Create a JAVA class called Student with the following details as variables within it.
a. USN, NAME, BRANCH, PHONE, PERCENTAGE
b. Write a JAVA program to create n Student objects and print the USN, Name, Branch, Phone, and percentage of these objects with suitable headings. */
import java.util.Scanner;

class Student {
    private String usn;
    private String name;
    private String branch;
    private String phone;
    private double percentage;

    public void setDetails(Scanner sc) {
        System.out.print("Enter USN: ");
        usn = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Branch: ");
        branch = sc.nextLine();
        System.out.print("Enter Phone: ");
        phone = sc.nextLine();
        System.out.print("Enter Percentage: ");
        percentage = sc.nextDouble();
        sc.nextLine(); // consume newline leftover from nextDouble()
    }

    @Override
    public String toString() { //
        return "Student [usn=" + usn + ", name=" + name + ", branch=" + branch + ", phone=" + phone + ", percentage="
                + percentage + "]";
    }

}

public class DisplayStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline leftover from nextInt()
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            students[i] = new Student(); // create new Student object
            students[i].setDetails(sc); // set details for the student
        }
        System.out.println("\nStudent Details:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

    }
}

/*
 * // To Compile and Run the Program:
 * cd N:\JavaCigCode
 * javac JavaLab\DisplayStudent.java
 * java JavaLab.DisplayStudent
 * e
 * 
 */
