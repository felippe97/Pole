package Pole.Pole;

public class SortL {
	StoPrvkovePole stoPrvkovePole = new StoPrvkovePole();
	
	int[] lava = stoPrvkovePole.lava;

	public Object SortL() {
		Integer[] data = new Integer[lava.length];
		for (int i = 0; i<data.length; i++) {
			for(int j = i + 1; j<data.length; j++) {
				if(data[j].compareTo(data[i])<0) {
					
				}
			}
		}
		return lava;
		
		
	}
}
