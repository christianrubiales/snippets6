package sequences;

import java.util.Arrays;

public class RelativeSort2 {

	/**
	 * If non-zero encountered, try to swap with previous zero.
	 */
	static Integer[] sort(Integer[] arr) {
		int swaps = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != 0) {
				for (int j = i; j > 0; j--) {
					if (arr[j-1] == 0) {
						int t = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = t;
						swaps++;
					} else {
						break;
					}
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
