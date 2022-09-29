package sk.filip.pole;

import java.util.Comparator;

public class SortBack implements Comparator{

	public int compare(Object o1, Object o2) {
		Pole p1=(Pole)o1;  
		Pole p2=(Pole)o2;  
		  
		if(p1.e==p2.e)  
		return 0;  
		else if(p1.e>p2.e)  
		return 1;  
		else  
		return -1;
		
	
	}

}
