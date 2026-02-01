public class CopyConstructor {
   private int id;
   private String name;

    // Parameterized constructor
    CopyConstructor(int i, String n) {
        id = i;
        name = n;
    }

    // Copy constructor
    CopyConstructor(CopyConstructor c) {
        id = c.id;
        name = c.name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor(1, "John");
        CopyConstructor obj2 = new CopyConstructor(obj1); // Using copy constructor

        obj1.display();
        obj2.display();
    }
    
}
