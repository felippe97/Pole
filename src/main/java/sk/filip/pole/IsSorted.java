package sk.filip.pole;

public class IsSorted {
	boolean isSorted(int[] array) {
	    for (int i = 0; i < array.length - 1; i++) {
	        if (array[i] > array[i + 1])
	            return false;
	    }
	    return true;
	}
	boolean isBackSorted(int[] array) {
	    for (int i = 0; i < array.length - 1; i++) {
	        if (array[i] < array[i + 1])
	            return false;
	    }
	    return true;
	}
}