package sequences;

/**
 * Must be case-insensitive and ignore special characters.
 */
public class Palindrome {
	
	static boolean isPalindrome(String s) {
		boolean palindrome = true;
		
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			char ci = s.charAt(i);
			while (!Character.isAlphabetic(ci) && i < j) {
				i++;
				ci = s.charAt(i);
			}
			char cj = s.charAt(j);
			while (!Character.isAlphabetic(cj) && i < j) {
				j--;
				cj = s.charAt(j);
			}
			if (Character.isAlphabetic(ci) && Character.isAlphabetic(cj)) {
				if (Character.toLowerCase(ci) != Character.toLowerCase(cj) ) {
					palindrome = false;
					break;
				}
				i++;
				j--;
			}
		}
		
		return palindrome;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(""));//true
		System.out.println(isPalindrome(" "));//true
		System.out.println(isPalindrome("a"));//true
		System.out.println(isPalindrome("aA"));//true
		System.out.println(isPalindrome("A man, a plan, a canal: PANAMA!!!"));//true
		System.out.println(isPalindrome("ab"));//false
	}

}
