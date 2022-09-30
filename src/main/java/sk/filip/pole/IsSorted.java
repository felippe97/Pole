package sk.filip.pole;

public class IsSorted {
	public static boolean isSorted(int[] input) {
		
		
	    return isSorted(input) ;
	}
	public static boolean isSorted(int[] input, int index) {
	    if (index < 2) {
	        return true;
	    } else if (input.length.compareTo(input.length) > 0) {
	        return false;
	    } else {
	        return isSorted(input, index - 1);
	    }
}
}