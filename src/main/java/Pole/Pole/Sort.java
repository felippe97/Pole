package Pole.Pole;

public class Sort {
	StoPrvkovePole stoPrvkovePole = new StoPrvkovePole();
	
	int[] pole = stoPrvkovePole.Pole();
	
	
	public int[] Sort() {
		Integer[] p = new Integer[pole.length];
		int n = pole.length;
		 for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	            	if (p[j].compareTo(p[i]) < 0) {
					int d = p[j];
					p[j] = p[i];
					p[i] = d;
					
				}

			}
		}
		return pole;

	}
}
