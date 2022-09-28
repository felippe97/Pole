package Pole.Pole;

public class Sort {
	
	Random random =  new Random();
	int[] pole = random.randomPole();
	
	int[] data = new int[pole.length];
	public int[] Sort() {
		int n = data.length;
		 for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
				if (data[j] >data[i+1]) {
					int d = data[j];
					data[j] = data[i];
					data[i] = d;
					
				}

			}
		}
		return data;

	}
}
