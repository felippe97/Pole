package sk.filip.pole;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubleSort implements Sort {

	public int[] sort(int[] input) {

		int n = input.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (input[j - 1] > input[j]) {

					temp = input[j - 1];
					input[j - 1] = input[j];
					input[j] = temp;

				}
			}
		}
		System.out.println("Buble"+Arrays.toString(input));
		return input;
	}

	public int[] sort1(int[] input) {
		int n = input.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (input[j - 1] > input[j]) {

					temp = input[j - 1];
					input[j - 1] = input[j];
					input[j] = temp;

				}
			}
		}
		System.out.println(input);
		return input;
	}

}