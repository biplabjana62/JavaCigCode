package ArraylistJava;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(50);
        list.add(2);
        list.add(88);
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Size of the list: " + list.size());

        for (int x : list) {
            System.out.println("Element: " + x);
        }
        System.out.print("Enter an element to search: ");
        System.out.println(list.contains(sc.nextInt()));// true or false
        // ? or
        System.out.println(list.contains(33)); //false
 list.remove(2); // remove element at index 2
        System.out.println("After removing element at index 2: " + list);
         list.add(2,9); // add element 9 at index 2
        System.out.println("After adding element at index 2: " + list);
        list.set(2,55); // set element at index 2 to 55
        System.out.println("After setting element at index 2: " + list);
        sc.close();
    }
}
