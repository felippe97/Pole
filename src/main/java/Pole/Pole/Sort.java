package Pole.Pole;

public class Sort {
	StoPrvkovePole stoPrvkovePole = new StoPrvkovePole();
	Random random =  new Random();
	int[] pole = random.randomPole();
	
	
	public int[] Sort() {
		int n = pole.length;
		 for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
				if (pole[j] >pole[i+1]) {
					int d = pole[j];
					pole[j] = pole[i];
					pole[i] = d;
					
				}

			}
		}
		return pole;

	}
}
