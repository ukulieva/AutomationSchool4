package task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		RandomArray randomArray = new RandomArray();
		Scanner number = new Scanner(System.in);
		int size = 0;
		System.out.print("Input array size: ");
		try {
			size = number.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please, input integer. Please, restart the program and try again.");
			number.close();
			return;
		}
		int array[] = randomArray.createArray(size);
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");

		}

		randomArray.processArray(2, array, true);
		randomArray.processArray(2, array, false);
		randomArray.processArray(3, array, true);
		randomArray.processArray(5, array, true);
		number.close();

	}
}
