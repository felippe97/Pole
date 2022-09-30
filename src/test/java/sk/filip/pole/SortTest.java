package sk.filip.pole;



import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SortTest {

	@Autowired
	protected Sort srt;
	@Test
	public void testSort(int[] arr) {
		int[] sortedArray = srt.sort(arr);
	}
}
