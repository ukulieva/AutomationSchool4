package task2;

public class QuadraticEquation {

	public String rootOfQuadraticEquation(int a, int b, int c) {
		int discriminant;
		double x1, x2;
		String result;
		discriminant = b * b - 4 * a * c;

		if (discriminant == 0) {
			x1 = -(b / (2 * a));
			x2 = x1;
			result = "Root #1 = Root #2 = " + x2;
		} else {
			if (discriminant > 0) {
				x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
				x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
				result = "Root #1 = " + x1 + " Root #2 = " + x2;
			} else {
				result = "The entered values aren't valid. The discriminant is negative. Please, restart the program and try again.";
			}
		}
		return result;
	}
}
