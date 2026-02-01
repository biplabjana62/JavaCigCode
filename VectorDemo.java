// import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // create a vector to store integers
        Vector<Integer> num = new Vector<>(5, 3);
        System.out.println("Initial size: " + num.size()); // size is 0
        System.out.println("Initial capacity: " + num.capacity()); // default capacity is 10
        // add elements to the vector
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(1);

        System.out.println("capasity after adding 6 elements: " + num.capacity()); // capacity increases

        LinkedList<Integer> list = new LinkedList<>();
        
        list.add(12);
        list.add(15);
        list.add(18);
        Vector<Integer> num2 = new Vector<>(list);
        System.out.println("Elements in num2 vector: " + num2);
        for (int i = 0; i < num2.size(); i++) {
            System.out.println("Element at index " + i + ": " + num2.get(i)); // access elements using get() method
        }
        list.clear(); // clear all elements from linked list
        System.out.println("Elements in linked list after clear(): " + list);
        num.clear(); // clear all elements from vector
        System.out.println("Elements in vector after clear(): " + num);

        // ArrayList<Integer> tlist = new ArrayList<>();
        Vector<Integer> tlist = new Vector<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                tlist.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                tlist.add(i);
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The size of ArrayList after multi-threading: " + tlist.size()); // may not be 2000 due to lack of synchronization
        // but for Vector it will be 2000 as it is synchronized
    }
}
