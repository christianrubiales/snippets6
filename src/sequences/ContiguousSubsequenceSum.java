package sequences;

/**
 * O(n) using two pointers
 */
public class ContiguousSubsequenceSum {
	
	public static boolean subsequenceExists(int[] array, int sum) {
		if (array.length == 0) {
			return false;
		}
		int i = 0;
		int j = 0;
		int total = array[j];
		boolean exists = false;
		
		while (i < array.length && j < array.length) {
			if (total == sum) {
				exists = true;
				break;
			} else if (total < sum || i == j) {
				j++;
				if (j < array.length) {
					total += array[j];
				}
			} else {
				total -= array[i];
				i++;
			}
		}
		
		return exists;
	}

	public static void main(String[] args) {
		System.out.println(subsequenceExists(new int[]{23, 5, 4, 7, 2, 11}, 20)); // true
		System.out.println(subsequenceExists(new int[]{23, 5, 4, 7, 2, 11}, 23)); // true
		System.out.println(subsequenceExists(new int[]{23, 5, 4, 7, 2, 11}, 11)); // true
		System.out.println(subsequenceExists(new int[]{23, 5, 4, 7, 2, 11}, 1)); // false
		System.out.println(subsequenceExists(new int[]{}, 20)); // false
		System.out.println(subsequenceExists(new int[]{1,2,3}, 6)); // true
		System.out.println(subsequenceExists(new int[]{1, 3, 5, 23, 2}, 8)); // true
		System.out.println(subsequenceExists(new int[]{1, 3, 5, 23, 2}, 7)); // false
		System.out.println(subsequenceExists(new int[]{6,3,4,10}, 20)); // false
	}

}
