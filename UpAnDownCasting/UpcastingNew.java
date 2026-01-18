package UpAnDownCasting;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
    @Override
    void sound() {
        System.out.println("Dog makes a sound bark");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
    @Override
    void sound() {
        System.out.println("Cat makes a sound meow");
    }

}

public class UpcastingNew {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.sound();
        // a.bark(); // This will cause a compile-time error
        // Downcasting
        System.out.println();
        Animal obj = new Dog();
        Dog d = (Dog) obj; // Downcasting
        d.bark();
        d.sound();
        System.out.println();

        Animal c= new Cat();
        Cat ca = (Cat) c; // Downcasting

        ca.meow();
        c.sound();

        // Animal animal = new Animal();
        // Dog dg = (Dog) animal; // This will cause a runtime error
        // dg.bark();
        // if (animal instanceof Dog) {
        // Dog dog = (Dog) animal;
        // dog.bark();
        // }
    }
}
