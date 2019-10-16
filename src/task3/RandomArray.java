package task3;

public class RandomArray {

	public int[] createArray(int size) {

		int[] array;
		array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		return array;

	}

	public void processArray(int number, int array[], boolean isZero) {
		if (isZero) {
			System.out.print("\n" + "Numbers divided by " + number + ": ");

			for (int i = 0; i < array.length; i++) {
				if (array[i] != 0) {
					if ((array[i] % number) == 0) {

						System.out.print(array[i] + " ");
					}
				}
			}

		} else {
			System.out.print("\n" + "Numbers don't divided by " + number + ": ");

			for (int i = 0; i < array.length; i++) {

				if ((array[i] % number) != 0) {

					System.out.print(array[i] + " ");
				}
			}

		}

	}
}