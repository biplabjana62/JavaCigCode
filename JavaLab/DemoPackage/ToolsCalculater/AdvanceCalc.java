package JavaLab.DemoPackage.ToolsCalculater;

public class AdvanceCalc {
    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }
}
