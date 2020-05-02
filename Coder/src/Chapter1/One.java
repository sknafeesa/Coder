package Chapter1;

import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter num 1");
		int a = in.nextInt();
		System.out.println("Enter num 2");
		int b = in.nextInt();
		int sum =a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		System.out.println("Addition "+ sum);
		System.out.println("Subtraction "+ sub);
		System.out.println("Multiplication "+mul);
		System.out.println("Division "+div);
	}
}
