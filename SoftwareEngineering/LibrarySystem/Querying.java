package SoftwareEngineering.LibrarySystem;

public class Querying {

    void searchBook(String bookName) {

        System.out.println("Searching for book: " + bookName);

        if (bookName.equalsIgnoreCase("Java")) {
            System.out.println("Book Found");
        } else {
            System.out.println("Book Not Found");
        }
    }
}