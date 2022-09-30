package sk.filip.pole;

import java.util.Arrays;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = i;
		}
		System.out.println("Zakladne pole " + Arrays.toString(num));
		Random rand = new Random();
		for (int i = 0; i < num.length; i++) {
			int r = rand.nextInt(num.length);
			int temp = num[r];
			num[r] = num[i];
			num[i] = temp;

		}
		BubleSortBack bubleSortBack = new  BubleSortBack();
		bubleSortBack.sort(num);
		System.out.println( Arrays.toString(num));
		BubleSort bubleSort = new BubleSort();
		bubleSort.sort(num);
		System.out.println(  Arrays.toString(num));
 
	}
}
