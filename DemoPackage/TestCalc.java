package DemoPackage;

import DemoPackage.ToolsCalculater.Calc;
import DemoPackage.ToolsCalculater.AdvanceCalc;
// also import DemoPackage.ToolsCalculater.*;

public class TestCalc {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(10, 5));
        System.out.println(c.subtract(10, 5));
        System.out.println("-------------------");
        AdvanceCalc ac = new AdvanceCalc();
        System.out.println(ac.multiply(10, 5));
        System.out.println(ac.divide(10, 5));
    }
}
