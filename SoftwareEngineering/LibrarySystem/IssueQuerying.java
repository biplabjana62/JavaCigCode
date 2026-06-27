package SoftwareEngineering.LibrarySystem;

public class IssueQuerying extends Querying {

    void issue(DataEntry data) {

        data.issue();
    }

    void renewal() {

        System.out.println("Book renewed successfully");
    }
}