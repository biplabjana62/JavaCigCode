public class Person {
    // Private variables (data hiding)
    String name;
    int age;

}

class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alice";
        person.age = 30;
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);

    }
}
