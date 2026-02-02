package JavaLab.RuntimePolymorphism;

import java.util.Scanner;

class Employee {
    private double basicSalary;

    Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double calculateSalary() {
        return 0;
    }
}

class Manager extends Employee {
    Manager(double basicSalary) {
        super(basicSalary);
    }

    @Override
    public double calculateSalary() {
        double bonus = 5000.0f; // fixed bonus for Manager
        return getBasicSalary() + bonus; // Manager gets an additional 5000
    }
}

class Programmer extends Employee {
    Programmer(double basicSalary) {
        super(basicSalary);
    }

    @Override
    public double calculateSalary() {
        double bonus = 2000.0f; // fixed bonus for Programmer
        return getBasicSalary() + bonus; // Programmer gets an additional 2000
    }
}

public class TestSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary of Employee: ");
        double basicSalary = sc.nextDouble();
        Employee emp = new Manager(basicSalary); // Upcasting to Employee reference
        System.out.println("Total Salary of Employee: " + emp.calculateSalary());
        System.out.println("--------------------------");
        System.out.print("Enter basic salary of Programmer: ");
        basicSalary = sc.nextDouble();
        Employee prog = new Programmer(basicSalary); // Upcasting to Employee reference
        System.out.println("Total Salary of Programmer: " + prog.calculateSalary());
        sc.close();
    }
}
