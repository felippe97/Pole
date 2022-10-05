package Pole.Pole;

import java.util.Arrays;

public class Random {
	StoPrvkovePole stoPrvkovePole = new StoPrvkovePole();
	int[] ranPole = stoPrvkovePole.Pole();
	java.util.Random random = new java.util.Random();

	public int[] randomPole() {
		for (int i = 0; i < ranPole.length; i++) {
			ranPole[i] = random.nextInt(ranPole.length);
		
		}
		System.out.println(Arrays.toString(ranPole));
		return ranPole;
	}

	
}
