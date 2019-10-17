package task7;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		double newN1 = 0;
		double newN2 = 0;
		Scanner number = new Scanner(System.in);

		while (true) {

			System.out.print("Input a first number: ");
			String n1 = number.next();
			if ("quit".equals(n1)) {
				break;
			}
			try {
				newN1 = Double.parseDouble(n1);
			} catch (NumberFormatException e) {
				System.out.println("Please, input correct number.");
				continue;
			}

			System.out.print("Input sign: ");
			String sign = number.next();
			if ("quit".equals(sign))
				break;
			double result;
			switch (sign) {
			case ("-"):
			case ("+"):
			case ("*"):
			case ("/"):
				break;
			default:
				System.out.println("Please, input correct sign: - + * /");
				continue;
			}

			System.out.print("Input a second number: ");
			String n2 = number.next();
			if ("quit".equals(n2))
				break;
			try {
				newN2 = Double.parseDouble(n2);
			} catch (NumberFormatException e) {
				System.out.println("Please, input correct number.");
				continue;
			}
			result=0;
			switch (sign) {
			case ("-"):
				result = newN1 - newN2;
				break;
			case ("+"):
				result = newN1 + newN2;
				break;
			case ("*"):
				result = newN1 * newN2;
				break;
			case ("/"):
				
			if (newN2==0) {
					System.out.println("Сann't be divided by 0.");
					continue;
				}
				result = newN1 / newN2;
				break;
			}
			System.out.println("Answer: " + result);
			continue;

		}
		number.close();
	}

}
