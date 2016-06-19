package set;

import java.util.HashSet;
import java.util.Set;

/**
 * O(n^2)
 */
public class R3SUM {
	
	static boolean sum3(int[] nums) {
		boolean contains = false;
		Set<Integer> set = new HashSet<Integer>();

		for (int i : nums) {
			set.add(i);
		}
		for (int i : nums) {
			for (int j : nums) {
				if (set.contains(-(i+j))) {
					return true;
				}
			}
		}
		
		return contains;
	}

	public static void main(String[] args) {
		System.out.println(sum3(new int[]{4, 2, -1, 1, -5, 6, -4}));//true
	}

}
