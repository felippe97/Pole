package sk.filip.pole;

import java.util.Comparator;

public class SortAlpha implements Comparator{

	public int compare(Object o1, Object o2) {
		Pole s =(Pole)o1;
		Pole s2 =(Pole)o2;
		return s.s.compareTo(s2.s);
	}

}
