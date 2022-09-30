package sk.filip.pole;

public class Pole {
	public int[] pole() {
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = i;
		}
		return num;
	}
}