package sk.filip.pole;

public class InsertSort implements Sort {

	public int[] sort(int[] input) {
		for(int i =1; i<input.length; i++) {
			int key = input[i];
			int j = i-1;
			while((j>-1) && (input[i] > key)) {
				input[j+1]=input[i];
				i--;
			}
		}for (int i : input) {
			
		}
		return input;
	}

}
