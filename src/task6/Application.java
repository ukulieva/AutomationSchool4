package task6;

public class Application {

	public static void main(String[] args) {

		Students[] group = new Students[5];

		group[0] = new Students("Yuliya", "Kulieva");
		group[1] = new Students("Sergey", "Serpeiko");
		group[2] = new Students("Mariya", "Moschenkova");
		group[3] = new Students("Nikolay", "Malash");
		group[4] = new Students("Inna", "Kulieva");

		/*
		 * System.out.print("Array of students: "); for (int i = 0; i < group.length;
		 * i++) { System.out.print(group[i]); }
		 */
		int[] result = new int[5];
		for (int i = 0; i < result.length; i++) {
			result[i] = (int) (Math.random() * 5 + 1);
		}
		/*
		 * System.out.print("\n" + "Array of marks: "); for (int i = 0; i <
		 * result.length; i++) { System.out.print(result[i] + " "); }
		 */
		int summaryOfArray = 0;
		for (int i = 0; i < result.length; i++) {

			summaryOfArray = summaryOfArray + result[i];

		}
		// System.out.print("\n");
		double average = (double) (summaryOfArray) / 5;
		System.out.print("Average mark of group arif: " + average);
	}

}
