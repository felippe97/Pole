package sk.filip.pole;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class SortTest {

	public static void main(String[] args) {
		SortTest test = new SortTest();
		test.sortTest(new BubleSort(), 10);
//		test.sortTest(new QuickSort(), 10);
//		test.sortTest(new KukuSort(), 10);
	}

	public static void oldmain(String[] args) {

		int[] num = new int[100];

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		Random rand = new Random();
		for (int i = 0; i < num.length; i++) {
			int r = rand.nextInt(num.length);
			int temp = num[r];
			num[r] = num[i];
			num[i] = temp;

		}
		IsSorted isSorted = new IsSorted();
		BubleSortBack bubleSortBack = new BubleSortBack();
		bubleSortBack.sort(num);
		System.out.println(Arrays.toString(num));

		BubleSort bubleSort = new BubleSort();
		bubleSort.sort(num);
		System.out.println(Arrays.toString(num));

	}

	void sortTest(Sort sort, int size) {
		isSorted(sort.sort(generateRandomArray(size)));
		isSorted(sort.sort(generateAscArray(size)));
		isSorted(sort.sort(generateDescArray(size)));
	}

	int[] generateRandomArray(int size) {
		Random random = new Random();
		int n = 10;
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = random.nextInt(n);
			size = result[i];
		}
		return new int[size];
	}

	int[] generateAscArray(int size) {
		Random random = new Random();
		int n = 100;
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
		int n = 100;
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
