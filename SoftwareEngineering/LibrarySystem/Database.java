package SoftwareEngineering.LibrarySystem;

import java.util.ArrayList;

public class Database {

    private ArrayList<String> books = new ArrayList<>();

    public Database() {
        books.add("Java Programming");
        books.add("Data Structures");
        books.add("Operating Systems");
        books.add("Computer Networks");
    }

    public boolean verifyLogin(String id, String password) {

        if (id.equals("admin") && password.equals("1234")) {
            return true;
        }
        return false;
    }

    public boolean searchBook(String bookName) {

        for (String book : books) {
            if (book.equalsIgnoreCase(bookName)) {
                return true;
            }
        }
        return false;
    }

    public void displayBooks() {

        System.out.println("\nAvailable Books:");

        for (String book : books) {
            System.out.println(book);
        }
    }
}