package Pole.Pole;

public class SortLava {
	Lava lava = new Lava();
	StoPrvkovePole l = lava.stoPrvkovePole;
	Integer[] dataLava;
	public Integer[] SortL() {
		
		Integer[] dataLava = new Integer[l.length];
		for (int i = 0; i < dataLava.length; i++) {
			for (int j = i + 1; j < dataLava.length; j++) {
				if (dataLava[j].compareTo(dataLava[i]) < 0) {
					int d = dataLava[j];
					dataLava[j] = dataLava[i];
					dataLava[i] = d;
					return dataLava;
				}

			}
		}
		return dataLava;
		

	}
	public Integer[] getDataLava() {
		return dataLava;
	}
	public void setDataLava(Integer[] dataLava) {
		this.dataLava = dataLava;
	}
	
}
