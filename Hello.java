import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter First value : ");
		float a = ob.nextFloat();
		System.out.print("Enter second value : ");
		float b = ob.nextFloat();
		ob.close();
		try {
			System.out.println("The sum value is: " + (a / b));
		} catch (Exception e) {
			System.out.println("Not Divisible by Zero!");
		}
		System.out.println("Syntex Error!");
	}
}
