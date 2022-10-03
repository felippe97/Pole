package sk.filip.pole;

import java.util.Arrays;
import java.util.Random;

public class SortTest {

	public static void main(String[] args) {

		SortTest test = new SortTest();
		test.sortTest(new BubleSort(), 10);
		test.sortTest(new InsertSort(), 10);	
//		test.sortTest(new QuickSort(), 10);
//		test.sortTest(new KukuSort(), 10);
		System.out.println(Arrays.toString(test.generateRandomArray(10)));
	}

	void sortTest(Sort sort, int size) {
		isSorted(sort.sort(generateRandomArray(size)));
		isSorted(sort.sort(generateAscArray(size)));
		isSorted(sort.sort(generateDescArray(size)));
	}

	int[] generateRandomArray(int size) {
		Random random = new Random();
		int n = size;
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = random.nextInt(n);
			size = result[i];
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
				return false;
		}
		return true;
	}

}
