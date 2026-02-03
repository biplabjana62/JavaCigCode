class DemoSingleton {
    private static DemoSingleton instance; // static variable to hold single instance

    private DemoSingleton() {
    }

    public static DemoSingleton getInstanc() {
        if (instance == null) { // check if instance is null
            instance = new DemoSingleton(); // create new instance if null
        }
        return instance;
    }
}

public class SingletonPattrn {
    public static void main(String[] args) {
        DemoSingleton obj1 = DemoSingleton.getInstanc();
        DemoSingleton obj2 = DemoSingleton.getInstanc();
        if (obj1 == obj2) {
            System.out.println("Both objects are the same instance.");
        } else {
            System.out.println("Objects are different instances.");
        }
 
    }
}
