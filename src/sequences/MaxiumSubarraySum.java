package sequences;

public class MaxiumSubarraySum {

	static int maxSum(int[] arr) {
		int maxToHere = arr[0];
		int maxSoFar = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			maxToHere = maxToHere + arr[i] > arr[i] ? maxToHere + arr[i] : arr[i];
			maxSoFar = maxToHere > maxSoFar ? maxToHere : maxSoFar;
		}
		
		return maxSoFar;
	}
	
	public static void main(String[] args) {
		System.out.println(maxSum(new int[]{-3,2,4,1,-3,-4}));//7
	}

}
