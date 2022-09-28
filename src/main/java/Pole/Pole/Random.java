package Pole.Pole;

public class Random {
	StoPrvkovePole stoPrvkovePole = new StoPrvkovePole();
	int[] ranPole = stoPrvkovePole.pole;
	Random random = new Random();

	public int[] randomPole() {
		for (int i = 0; i < ranPole.length; i++) {
			int r = random.nextInt(ranPole.length);
			int d = ranPole[r];
			ranPole[r] = ranPole[i];
			ranPole[i] = d;
		}
		return ranPole;
	}

	public int[] getRanPole() {
		return ranPole;
	}

	public void setRanPole(int[] ranPole) {
		this.ranPole = ranPole;
	}

	private int nextInt(int length) {
		// TODO Auto-generated method stub
		return 0;
	}
}
