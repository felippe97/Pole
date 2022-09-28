package Pole.Pole;

public class SortPrava {
	Prava prava = new Prava();
	int[] p = prava.PolPole();
	Integer[] dataPrava;
	public Integer[] SortL() {
		
		Integer[] dataPrava = new Integer[p.length];
		for (int i = 0; i < dataPrava.length; i++) {
			for (int j = i + 1; j < dataPrava.length; j++) {
				if (dataPrava[j].compareTo(dataPrava[i]) < 0) {
					int d = dataPrava[j];
					dataPrava[j] = dataPrava[i];
					dataPrava[i] = d;
					return dataPrava;
				}

			}
		}
		return dataPrava;
		

	}
	public Integer[] getDataPrava() {
		return dataPrava;
	}
	public void setDataPrava(Integer[] dataPrava) {
		this.dataPrava = dataPrava;
	}
}
