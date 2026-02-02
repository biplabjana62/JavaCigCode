package JavaLab.ProgramShap;
/*13. Write a Java program to create a class called Shape with methods called get Perimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle. */
import java.util.Scanner;

public class DemoShap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        sc.close();
        Circle circle = new Circle(radius);
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
    }
}
