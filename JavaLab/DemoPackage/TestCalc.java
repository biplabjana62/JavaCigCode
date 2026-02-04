package JavaLab.DemoPackage;

import JavaLab.DemoPackage.ToolsCalculater.AdvanceCalc;
import JavaLab.DemoPackage.ToolsCalculater.Calc;

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

/*
 * PS C:\Users\bipla> cd N:\JavaCigCode
 * PS N:\JavaCigCode> javac JavaLab\DemoPackage\TestCalc.java
 * PS N:\JavaCigCode> java JavaLab.DemoPackage.TestCalc
 * 
 * 
 * 15
 * 5
 * -------------------
 * 50
 * 2.0
 * PS N:\JavaCigCode>
 * 
 * 
 * 
 * 
 * on cmd line
 * cd /d N:\JavaCigCode
 * javac JavaLab\DemoPackage\TestCalc.java
 * 
 * java JavaLab.DemoPackage.TestCalc
 * 
 */