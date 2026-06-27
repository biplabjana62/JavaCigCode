package SoftwareEngineering.LibrarySystem;

public class Student {

    String name;

    Student(String name) {

        this.name = name;
    }

    void enterBook(String book) {

        System.out.println(name + " entered book name: " + book);
    }
}