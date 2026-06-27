package SoftwareEngineering.StudentMarksAnalyzing;

import java.util.Scanner;

class Applicant {

    int app_id;
    String app_name;

    Applicant(int app_id, String app_name) {
        this.app_id = app_id;
        this.app_name = app_name;
    }

    void fill_form() {
        System.out.println("Application Form Submitted Successfully.");
        System.out.println("Applicant ID: " + app_id);
        System.out.println("Applicant Name: " + app_name);
    }
}

class Validation {

    String phone_no;
    String address;
    int age;
    int mark;

    Validation(String phone_no, String address, int age, int mark) {
        this.phone_no = phone_no;
        this.address = address;
        this.age = age;
        this.mark = mark;
    }

    boolean valid_data() {

        if (phone_no.length() == 10 && age > 16) {
            return true;
        } else {
            return false;
        }
    }

    boolean valid_criteria() {

        if (mark >= 40) {
            return true;
        } else {
            return false;
        }
    }
}

class Admin {

    String mail_id;
    int reg_no;

    Admin(String mail_id, int reg_no) {
        this.mail_id = mail_id;
        this.reg_no = reg_no;
    }

    void issue_hall_ticket(Applicant applicant) {

        System.out.println("\n===== HALL TICKET GENERATED =====");
        System.out.println("Registration Number: " + reg_no);
        System.out.println("Applicant Name: " + applicant.app_name);
        System.out.println("Admin Mail ID: " + mail_id);
        System.out.println("Hall Ticket Issued Successfully.");
    }
}

public class StudentMarksAnalyzingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT MARKS ANALYZING SYSTEM =====");

        // Applicant Input
        System.out.print("Enter Applicant ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Applicant Name: ");
        String name = sc.nextLine();

        Applicant applicant = new Applicant(id, name);
        applicant.fill_form();

        // Validation Input
        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        Validation validation = new Validation(phone, address, age, marks);

        // Data Validation
        if (!validation.valid_data()) {

            System.out.println("\nApplication Rejected: Invalid Data.");
            sc.close();
            return;
        }

        // Eligibility Check
        if (!validation.valid_criteria()) {

            System.out.println("\nApplication Rejected: Not Eligible.");
            sc.close();
            return;
        }

        // Admin Processing
        Admin admin = new Admin("admin@college.com", 1001);

        admin.issue_hall_ticket(applicant);

        sc.close();
    }
}