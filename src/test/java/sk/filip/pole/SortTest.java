package sk.filip.pole;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SortTest {

	@Autowired
	protected Sort srt;

	@Autowired
	protected SortBack sortBack;

	@Test
	public void testSort(int[] arr) {
		int[] sortedArrays = new int[100];

		for (int i = 0; i < sortedArrays.length; i++) {
			sortedArrays[i] = i + 1;
		}
		sortedArrays = srt.sort(arr);
		assertNotNull(sortedArrays);
	}

	@Test
	private void testSortBack(int[] arr) {
		int[] sortedArrays = new int[100];

		for (int i = 0; i < sortedArrays.length; i++) {
			sortedArrays[i] = i + 1;
		}
		sortedArrays = sortBack.sort(arr);
		assertNotNull(sortedArrays);
	}
}
