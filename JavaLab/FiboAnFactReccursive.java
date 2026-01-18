package JavaLab;

import java.util.Scanner;

public class FiboAnFactReccursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FiboAnFactReccursive ff = new FiboAnFactReccursive();
        System.out.println(
                "Enter your choice: \n1. Factorial Recursive\n2. Factorial Non-Recursive\n3. Fibonacci Recursive\n4. Fibonacci Non-Recursive");
        byte choice = sc.nextByte();
        switch (choice) {
            case 1:

                System.out.print("Enter a number to find factorial (recursive): ");
                double factRec = sc.nextDouble();
                double resultRecFact = ff.recursiveFactorial(factRec);
                System.out.println("Factorial of " + factRec + " (recursive) is: " + resultRecFact);
                break;
            case 2:
                System.out.print("Enter a number to find factorial (non-recursive): ");
                double factNonRec = sc.nextDouble();
                double resultNonRecFact = ff.factorialNonRecursive(factNonRec);
                System.out.println("Factorial of " + factNonRec + " (non-recursive) is: " + resultNonRecFact);
                break;
            case 3:
                System.out.print("Enter a number to find Fibonacci (recursive): ");
                long fiboRec = sc.nextLong();
                System.out.println("Fibonacci series up to " + fiboRec + " (recursive) is: ");
                for (int i = 0; i <= fiboRec; i++) {
                    System.out.print(ff.recursiveFibonacci(i) + " ");
                }
                break;
            case 4:
                System.out.print("Enter a number to find Fibonacci (non-recursive): ");
                long fiboNonRec = sc.nextLong();
                long resultNonRecFibo = ff.fibonacciNonRecursive(fiboNonRec);
                System.out.println("\nSum of Fibonacci numbers up to " + fiboNonRec + " is: " + resultNonRecFibo);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid option.");
                sc.close();
                break;
        }

    }

    protected double recursiveFactorial(double fact) {
        if (fact == 1 || fact == 0) {
            return 1;
        } else {
            return fact * recursiveFactorial(fact - 1);
        }
    }

    protected long recursiveFibonacci(long fibo) {
        if (fibo == 0) {
            return 0;
        } else if (fibo == 1) {
            return 1;
        } else {

            return recursiveFibonacci(fibo - 1) + recursiveFibonacci(fibo - 2);
        }
    }

    protected double factorialNonRecursive(double fact) {
        double result = 1;
        for (int i = 1; i <= fact; i++) {
            result = result * i;
        }
        return result;
    }

    protected long fibonacciNonRecursive(long fibo) {
        long a = 0L, b = 1L, nextTerm = 0L, sum = 0L;
        if (fibo == 0) {
            return 0;
        } else if (fibo == 1) {
            return 1;
        } else {
            sum = a + b;
            System.out.print("0 1 ");
            for (int i = 2; i <= fibo; i++) {
                nextTerm = a + b;
                a = b;
                b = nextTerm;
                sum += nextTerm;
                System.out.print(nextTerm + " ");
            }
            return sum;
        }

    }

}
