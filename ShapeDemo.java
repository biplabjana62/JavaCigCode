import java.util.Scanner;

public class ShapeDemo {
    private double len, brea, side, height, s1, s2, s3;

    // Perimeter of Rectangle
    ShapeDemo(double side) {
        this.side = side;
    }

    public void perimeterOfSquare() {
        System.out.println("Perimeter of Square: " + (4 * side));
    }

    ShapeDemo(double len, double brea) { // Perimeter of Rectangle
        this.len = len;
        this.brea = brea;
    }

    public void perimeterOfRectangle() { // Perimeter of Rectangle
        System.out.println("Perimeter of Rectangle: " + 2 * (len + brea));
    }

    ShapeDemo(double brea, double height, boolean isTriangle) {// Area of Triangle
        this.brea = brea;
        this.height = height;
    }

    public void areaOfTriangle() {// Area of Triangle
        System.out.println("Area of Triangle: " + (0.5 * brea * height));
    }

    ShapeDemo(double s1, double s2, double s3) {// Area of Triangle using Heron's formula
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public void areaOfTriangleHeron() { // Area of Triangle using Heron's formula
        double s = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        System.out.println("Area of Triangle (Using 3 Sides Formula): " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        ShapeDemo square = new ShapeDemo(side);
        square.perimeterOfSquare();
        System.out.print("Enter length and breadth of rectangle: ");
        double len = sc.nextDouble();
        double brea = sc.nextDouble();
        ShapeDemo rectangle = new ShapeDemo(len, brea);
        rectangle.perimeterOfRectangle();
        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        ShapeDemo triangle = new ShapeDemo(base, height, true);
        triangle.areaOfTriangle();
        System.out.print("Enter three sides of triangle: ");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        ShapeDemo triangleHeron = new ShapeDemo(s1, s2, s3);
        triangleHeron.areaOfTriangleHeron();
        sc.close();
    }
}
