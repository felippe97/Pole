package Pole.Pole;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		StoPrvkovePole stoPrvkovePole = new StoPrvkovePole();
		int[] pole = stoPrvkovePole.Pole();
		System.out.println(Arrays.toString(pole));
		System.out.println();
		Random random = new Random();
		int [] ran = random.randomPole();
		System.out.println(Arrays.toString(ran));
		System.out.println();
		Prava prava =new Prava();
		int[] pr = prava.PolPole();
		System.out.println(Arrays.toString(pr));
		System.out.println();
		Sort sort = new Sort();
		int[] sL = sort.data;
		System.out.println(Arrays.toString(sL));
		System.out.println();
		Lava lava =new Lava();
		int[] la = lava.PolPole();
		System.out.println(Arrays.toString(la));
	}
}
