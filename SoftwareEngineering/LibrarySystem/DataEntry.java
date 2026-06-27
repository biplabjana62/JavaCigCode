package SoftwareEngineering.LibrarySystem;

public class DataEntry {

    String name;
    int idNo;
    String bookName;
    String author;
    String DOI;
    String DOR;
    String cardNo;

    DataEntry(String name, int idNo, String bookName, String author, String cardNo) {

        this.name = name;
        this.idNo = idNo;
        this.bookName = bookName;
        this.author = author;
        this.cardNo = cardNo;
    }

    void issue() {

        DOI = "Today";
        System.out.println("Book issued to " + name);
    }

    void returnBook() {

        DOR = "Today";
        System.out.println("Book returned by " + name);
    }

    void display() {

        System.out.println("Student Name: " + name);
        System.out.println("ID: " + idNo);
        System.out.println("Book: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Card No: " + cardNo);
    }
}