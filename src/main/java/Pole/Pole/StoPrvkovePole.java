package Pole.Pole;

public class StoPrvkovePole {

	int[] pole;
	int[] prava;
	int[] lava;

	public int[] StoPrvkovePole() {
		pole = new int[100];

		for (int i = 0; i < pole.length; i++) {
			pole[i] = i;
		}
		return pole;
	}

	public int[] getPole() {
		return pole;
	}

	public void setPole(int[] pole) {
		this.pole = pole;
	}

	public int[] PolPole() {
		int data = pole.length;
		int[] lava = new int[(data + 1) / 2];
		prava = new int[data - lava.length];
		for (int i = 0; i < data; i++) {
			if (i < lava.length) {
				lava[i] = pole[i];
			} else {
				prava[i - lava.length] = pole[i];
				return prava;
			}
		}
		return lava;
	}

	public int[] getLava() {
		return lava;
	}

	public void setLava(int[] lava) {
		this.lava = lava;
	}

	public Object SortP() {
		Integer[] data = new Integer[prava.length];
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[j].compareTo(data[i]) > 0) {
					int d = data[j];
					data[j] = data[i];
					data[i] = d;

				}

			}
		}
		return data;
	
	}
	

}
