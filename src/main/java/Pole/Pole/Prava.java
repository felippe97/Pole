package Pole.Pole;

public class Prava {
	StoPrvkovePole stoPrvkovePole = new StoPrvkovePole();
	int[] data = stoPrvkovePole.Pole();
	int[] prava;
	
	public int[] PolPole() {
		int d = data.length;
		int[] lava = new int[(d + 1) / 2];
		 prava = new int[d - lava.length];
		for (int i = 0; i < d; i++) {
			if (i < lava.length) {
				lava[i] = data[i];
			} else {
				prava[i - lava.length] = data[i];
			}
		}
		return lava;
	}
}
