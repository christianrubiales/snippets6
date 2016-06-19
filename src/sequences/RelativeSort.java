package sequences;

import java.util.Arrays;

public class RelativeSort {

	/**
	 * Bubble all zeroes to the right
	 */
	static Integer[] sort(Integer[] arr) {
		int swaps = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == 0) {
				for (int j = i; j < arr.length-1; j++) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
					swaps++;
				}
			}
		}
		System.out.println(swaps);
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(sort(new Integer[]{0,1,0,5,1,2,0,3,1,2,0})));//1,5,1,2,3,1,2,0,0,0,0

	}

}
