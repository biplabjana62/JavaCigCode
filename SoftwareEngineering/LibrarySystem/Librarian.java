package SoftwareEngineering.LibrarySystem;

public class Librarian {

    Library library = new Library();

    boolean login(String id, String password) {

        return library.verifyLogin(id, password);
    }

    void searchBook(String bookName) {

        library.checkBook(bookName);
    }
}