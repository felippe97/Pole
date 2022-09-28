package Pole.Pole;

public class StoPrvkovePole {

	int[] pole;
	public int[] Pole() {
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

	

}
