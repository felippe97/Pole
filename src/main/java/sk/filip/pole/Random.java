package sk.filip.pole;

import java.util.Random;

public class Random {
	Random rand = new Random();
	Pole pole = new Pole();
	
	public int random(){
		int[] num = pole.pole();
	for (int i = 0; i < num.length; i++) {
		int r = rand.nextInt(num.length);
		int temp = num[r];
		num[r] = num[i];
		num[i] = temp;

	}
}
}