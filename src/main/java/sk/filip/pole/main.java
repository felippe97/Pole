package sk.filip.pole;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;

public class main {

	private static ArrayList<Pole> list;

	public static void main(String[] args) {
		list = new ArrayList<Pole>();
		list.add(new Pole(2, "s"));
		list.add(new Pole(1, "g"));
		list.add(new Pole(4, "i"));
		list.add(new Pole(3, "h"));
		list.add(new Pole(5, "q"));
		list.add(new Pole(7, "u"));
		list.add(new Pole(9, "a"));
		list.add(new Pole(6, "e"));
		list.add(new Pole(11, "m"));
		list.add(new Pole(8, "t"));
		Collections.sort(list, new SortAlpha());
		Iterator<Pole> itr3 = list.iterator();
		while (itr3.hasNext()) {
			Pole st = itr3.next();
			System.out.println(st.s + st.e);
		}
		System.out.println("\n");
		/*
		 * Collections.sort(list, new BubleSort()); Iterator<Pole> itr =
		 * list.iterator(); while (itr.hasNext()) { Pole st = itr.next();
		 * System.out.println(st.e + st.s); }
		 */
		System.out.println("\n");

		Collections.sort(list, new SortBack());
		Iterator<Pole> itr2 = list.iterator();
		while (itr2.hasNext()) {
			Pole st = itr2.next();
			System.out.println(st.e + st.s);
		}

	}
}
