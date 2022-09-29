package Pole.Pole;

public class Lava {
	StoPrvkovePole stoPrvkovePole = new StoPrvkovePole();
	int[] data = stoPrvkovePole.Pole();
	int[] lava;
	
	public int[] PolPole() {
		int d = data.length;
		 lava = new int[(d + 1) / 2];
		int[] prava = new int[d - lava.length];
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
