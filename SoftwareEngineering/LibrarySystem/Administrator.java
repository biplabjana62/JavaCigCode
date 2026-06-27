package SoftwareEngineering.LibrarySystem;

public class Administrator {

    boolean verifyAuthentication(String id, String password) {

        if (id.equals("admin") && password.equals("1234")) {
            return true;
        }

        return false;
    }
}