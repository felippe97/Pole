package sk.filip.pole;

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
		/*
		 * int n = size; int[] result = new int[n]; for (int i = 0; i < n; i++) {
		 * result[i] = random.nextInt(n); size = result[i]; }
		 */
		int n = size;
		int[] result = new int[n];
		for (int i = 0; i < result.length; i++) {
			int r = random.nextInt(n) + 1;
			size = r;
		}
		return new int[size];

	}

	int[] generateAscArray(int size) {
		Random random = new Random();
		int n = size;
		int[] num = new int[n];
		for (int i = 0; i < num.length; i++) {
			int r = random.nextInt(num.length);
			int temp = num[r];
			num[r] = num[i];
			num[i] = temp;
			size = num[i];
		}
		return new int[size];

	}

	int[] generateDescArray(int size) {
		Random random = new Random();
		int n = size;
		int[] num = new int[n];
		for (int i = 0; i < num.length; i++) {
			int r = random.nextInt(num.length);
			int temp = num[r];
			num[r] = num[i];
			num[i] = temp;
		}
		int n1 = num.length;

		for (int i = 0; i < n1 / 2; i++) {
			int temp = num[i];
			num[i] = num[n - i - 1];
			num[n - i - 1] = temp;
			size = num[i];
		}
		return new int[size];
	}

	boolean isSorted(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1])
				return false;
		}
		return true;
	}

	boolean isBackSorted(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] < array[i + 1])
				return true;
		}
		return false;
	}

}
