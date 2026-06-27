import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        PrimeNumber pn = new PrimeNumber();

        for (int i = 2; i <= num; i++) {
            pn.isPrime(i);
        }
    }

    public void isPrime(int n) {

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime number: " + n);
        }
    }
} 