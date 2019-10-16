package task4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciApplication {

	public static void main(String[] args) {
		System.out.print("Input number: ");
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		try {
			number = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please, input integer. Please, restart the program and try again.");
			scanner.close();
			return;
		}

		if (number >= 47 | number < 2)
			System.out.print(
					"The program doesn't work in the specified range. Please, input integer more than 2 and less than 47, restart the program and try again.");
		else {
			int n2;
			int n0 = 1;
			int n1 = 1;
			System.out.print(n0 + " " + n1 + " ");
			for (int i = 3; i <= number; i++) {
				n2 = n0 + n1;
				System.out.print(n2 + " ");
				n0 = n1;
				n1 = n2;
			}

		}
		scanner.close();
	}
}
