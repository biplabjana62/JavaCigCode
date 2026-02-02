package SuperDemo;

class ShapeA {
    private double length;

    ShapeA() {
        System.out.println("This is ShapeA constructor");
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

}

class RectangleB extends ShapeA {
    private double width, height;

    RectangleB() {
        super();
        System.out.println("This is RectangleB constructor");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getLength() * getHeight() * getWidth();
    }

}

public class SuperMain {
    public static void main(String[] args) {
        RectangleB rect = new RectangleB();
        rect.setLength(10);
        rect.setWidth(5);
        rect.setHeight(4);
        System.out.println("Volume of RectangleB: " + rect.getVolume());

    }
}