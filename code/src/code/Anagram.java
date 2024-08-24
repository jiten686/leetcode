package code;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("anagram","nagaram"));
			  
	}

	private static boolean isAnagram(String s, String t) {
	char [] arr1 = s.toCharArray();
	char [] arr2 = t.toCharArray();
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);

	return Arrays.equals(arr1, arr2);
	
	}

}
