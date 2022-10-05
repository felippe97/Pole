package sk.filip.pole;

import java.util.Arrays;
import java.util.Random;

public class SortTest {

	public static void main(String[] args) {

		SortTest test = new SortTest();
		System.out.println("Buble sort test");
		boolean result = test.sortTest(new BubleSort(), 10);
		System.out.println("    ... " + (result ? "OK" : "NOT OK"));

		System.out.println("Insert sort test");
		result = test.sortTest(new InsertSort(), 10);
		System.out.println("    ... " + (result ? "OK" : "NOT OK"));

		System.out.println("Unsort test");
		result = test.sortTest(new UnsortSort(), 10);
		System.out.println("    ... " + (result ? "OK" : "NOT OK"));

//		test.sortTest(new QuickSort(), 10);
//		test.sortTest(new KukuSort(), 10);
	}

	boolean sortTest(Sort sort, int size) {
		boolean result = isSorted(sort.sort(generateRandomArray(size)));

		result = result && isSorted(sort.sort(generateAscArray(size)));
		result = result && isSorted(sort.sort(generateDescArray(size)));
		return result;
	}

	int[] generateRandomArray(int size) {
		Random random = new Random();
		int[] ranPole = new int[size];
		for (int i = 0; i < ranPole.length; i++) {
			ranPole[i] = random.nextInt(ranPole.length);
			

		}

		System.out.println("generateRandomArray " + Arrays.toString(ranPole));
		return ranPole;
	}

	int[] generateAscArray(int size) {
		
		Random random = new Random();
		int[] ranPole = new int[size];
		for (int i = 0; i < ranPole.length; i++) {
			ranPole[i] = random.nextInt(ranPole.length);;
			

		}
		System.out.println("generateAscArray " + Arrays.toString(ranPole));
		return ranPole;

	}

	int[] generateDescArray(int size) {
		Random random = new Random();
		int[] ranPole = new int[size];
		for (int i = 0; i < ranPole.length; i++) {
			ranPole[i] = random.nextInt(ranPole.length);

		}

		for (int i = 0; i < size / 2; i++) {
			int temp = ranPole[i];
			ranPole[i] = ranPole[size - i - 1];
			ranPole[size - i - 1] = temp;

		}

		System.out.println("generateDescArray " + size);
		return ranPole;
	}

	boolean isSorted(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < array[i + 1])
				System.out.println(true);
			return true;
		}
		System.out.println("b" + false);
		return false;
	}

	boolean isBackSorted(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < array[i + 1])
				return true;
		}
		return false;
	}

}
