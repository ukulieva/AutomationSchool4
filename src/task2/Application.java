package task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;

		Scanner number = new Scanner(System.in);

		System.out.print("Input a : ");
		try {
			a = number.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please, input integer. Please, restart the program and try again.");
			number.close();
			return;
		}

		System.out.print("Input b : ");
		try {
			b = number.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please, input integer. Please, restart the program and try again.");
			number.close();
			return;
		}

		System.out.print("Input c : ");
		try {
			c = number.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please, input integer. Please, restart the program and try again.");
			number.close();
			return;
		}

		QuadraticEquation equation = new QuadraticEquation();

		System.out.println(equation.rootOfQuadraticEquation(a, b, c));
		number.close();
	}
}
