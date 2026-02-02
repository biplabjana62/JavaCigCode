class DemoSingleton {
    private static DemoSingleton instance;

    private DemoSingleton() {
    }

    public static DemoSingleton getInstanc() {
        if (instance == null) {
            instance = new DemoSingleton();
        }
        return instance;
    }
}

public class SingletonPattrn {
    public static void main(String[] args) {
        
    }
}
