package SoftwareEngineering.CourseReg;

import java.util.Scanner;

class Student {

    String name;
    int registerNumber;
    int marks;

    Student(String name, int registerNumber, int marks) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.marks = marks;
    }

    void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Marks: " + marks);
    }
}

class Subjects {

    String name;

    Subjects(String name) {
        this.name = name;
    }

    void displaySubject() {
        System.out.println("Subject: " + name);
    }
}

class Course {

    String name;
    Subjects subject;

    Course(String name, Subjects subject) {
        this.name = name;
        this.subject = subject;
    }

    void displayCourse() {
        System.out.println("Course: " + name);
        subject.displaySubject();
    }
}

class Reservation {

    Student student;
    Course course;

    Reservation(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    void reserveCourse() {
        System.out.println("\nCourse Reserved Successfully!");
        student.displayStudent();
        course.displayCourse();
    }
}

class Payment {

    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    void makePayment() {
        System.out.println("Payment Amount: " + amount);
    }
}

class CreditPayment extends Payment {

    CreditPayment(double amount) {
        super(amount);
    }

    void payByCredit() {
        System.out.println("Payment done using Credit Card");
        makePayment();
    }
}

class CashPayment extends Payment {

    CashPayment(double amount) {
        super(amount);
    }

    void payByCash() {
        System.out.println("Payment done using Cash");
        makePayment();
    }
}

class Administrator {

    String username;
    String password;

    Administrator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean login(String user, String pass) {

        if (username.equals(user) && password.equals(pass)) {
            System.out.println("Administrator Login Successful");
            return true;
        } else {
            System.out.println("Administrator Login Failed");
            return false;
        }
    }

    void checkAvailability(Course course) {
        System.out.println("\nChecking availability for course: " + course.name);
        System.out.println("Course is available.");
    }

    void confirmReservation() {
        System.out.println("Administrator confirmed the reservation.");
    }
}

public class CourseRegistrationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== COURSE REGISTRATION SYSTEM =====");

        // Student Input
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Register Number: ");
        int regNo = sc.nextInt();

        if (regNo <= 0) {
            System.out.println("Invalid Register Number!");
            return;
        }

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        sc.nextLine();

        if (marks < 50) {
            System.out.println("Student is not eligible for course registration.");
            return;
        }

        Student student = new Student(name, regNo, marks);

        // Administrator Login
        Administrator admin = new Administrator("admin", "1234");

        System.out.print("\nEnter Admin Username: ");
        String adminUser = sc.next();

        System.out.print("Enter Admin Password: ");
        String adminPass = sc.next();
        sc.nextLine();

        if (!admin.login(adminUser, adminPass)) {
            System.out.println("Access denied.");
            return;
        }

        // Subject Input
        System.out.print("\nEnter Subject Name: ");
        String subjectName = sc.nextLine();
        Subjects subject = new Subjects(subjectName);

        // Course Input
        System.out.print("Enter Course Name: ");
        String courseName = sc.nextLine();
        Course course = new Course(courseName, subject);

        admin.checkAvailability(course);

        // Reservation
        Reservation reservation = new Reservation(student, course);
        reservation.reserveCourse();

        admin.confirmReservation();

        // Payment
        System.out.print("\nEnter Payment Amount: ");
        double amount = sc.nextDouble();

        System.out.println("\nChoose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Cash");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            CreditPayment payment = new CreditPayment(amount);
            payment.payByCredit();
        }
        else if (choice == 2) {
            CashPayment payment = new CashPayment(amount);
            payment.payByCash();
        }
        else {
            System.out.println("Invalid Payment Option");
        }

        System.out.println("\nCourse Registration Completed Successfully!");

        sc.close();
    }
}