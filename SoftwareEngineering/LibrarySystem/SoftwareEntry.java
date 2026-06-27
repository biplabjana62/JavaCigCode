package SoftwareEngineering.LibrarySystem;

import java.util.Scanner;

public class SoftwareEntry {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student("Rahul");
        Librarian librarian = new Librarian();

        System.out.println("Enter Login ID:");
        String id = sc.nextLine();

        System.out.println("Enter Password:");
        String password = sc.nextLine();

        if (librarian.login(id, password)) {

            System.out.println("Permission Granted");

            System.out.println("Enter Book Name:");
            String book = sc.nextLine();

            student.enterBook(book);

            librarian.searchBook(book);

            System.out.println("Enter Author Name:");
            String author = sc.nextLine();

            DataEntry data = new DataEntry("Rahul",101,book,author,"C101");

            Querying q = new Querying();
            q.searchBook(book);

            IssueQuerying issue = new IssueQuerying();
            issue.issue(data);

            ReturnQuerying ret = new ReturnQuerying();
            ret.returnBook(data);

            data.display();

        } else {

            System.out.println("Permission Denied");
        }

        sc.close();
    }
}