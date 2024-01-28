package code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] {"dog","racecar","car"}));

	}

	private static String longestCommonPrefix(String[] strs) {
		StringBuilder sb = new StringBuilder();
		Arrays.sort(strs);
		String first =strs[0];
		String last = strs[strs.length-1];
		
		for(int i=0;i<Math.min(first.length(), last.length());i++) {
			if(first.charAt(i)!=last.charAt(i)) {
				return sb.toString();
			}else {
				sb.append(first.charAt(i));
			}
		}
		
		return sb.toString();
	}

}
