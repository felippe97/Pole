package sk.filip.pole;

import java.util.Arrays;
import java.util.Collections;
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
		int[] num = new int[size];
		for (int i = 0; i < num.length; i++) {
			num[i] = i;

		}
		System.out.println("generateAscArray " + Arrays.toString(num));
		return num;

	}

	int[] generateDescArray(int size) {

		int[] num = new int[size];
		for (int i = 0; i < num.length; i++) {
			num[i] = i;

		}
		int n = num.length;

		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (num[j - 1] < num[j]) {

					temp = num[j - 1];
					num[j - 1] = num[j];
					num[j] = temp;

				}
			}
		}
		System.out.println("generateDescArray " + Arrays.toString(num));

		return num;
	}

	boolean isSorted(int[] array) {
		 for (int i = 0; i < array.length - 1; i++)
	        {
	            if (array[i] > array[i + 1]) {
	                return false;
	            }
	        }
	 
	        return true;
	    }

	/*
	 * boolean isBackSorted(int[] array) { for (int i = 0; i < array.length - 1;
	 * i++) { if (array[i] < array[i + 1]) System.out.println(true); return true; }
	 * System.out.println(false); return false; }
	 */

}
