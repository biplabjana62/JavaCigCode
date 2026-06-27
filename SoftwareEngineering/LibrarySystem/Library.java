package SoftwareEngineering.LibrarySystem;

public class Library {

    Administrator admin = new Administrator();

    boolean verifyLogin(String id, String password) {

        return admin.verifyAuthentication(id, password);
    }

    void checkBook(String book) {

        System.out.println("Checking book in database...");
    }
}