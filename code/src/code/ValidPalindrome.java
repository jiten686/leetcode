package code;

import java.util.HashMap;
import java.util.Map;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "   A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
		System.out.println(isPalindrome2(s));
		
		int[] nums = { 2, 2, 1,2 };
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i]))
				map.put(nums[i], 1);
			else {
				int val = map.get(nums[i]);
				map.put(nums[i], ++val);
			}
		}
		
		map.forEach((k,v)->System.out.println(k + " "+v));


	}

	private static boolean isPalindrome2(String s) {
		if(s==null || s.isEmpty())
			return true;
		StringBuilder sb = new StringBuilder();
		for(Character c : s.toCharArray()) {
			if(Character.isLetterOrDigit(c))
				sb.append(Character.toLowerCase(c));
		}
		return sb.toString().equals(sb.reverse().toString());
	}

	private static boolean isPalindrome(String s) {
		//s=s.trim();
		if(s==null)
			return true; 
		s=s.replaceAll("[^a-zA-Z0-9]","");
		if(s.isEmpty())
			return true;
		s=s.toLowerCase();
		System.out.println(s);
		int start=0;
		int end = s.length()-1;
		while(start < end) {
			if(s.charAt(start)==s.charAt(end)) {
				start++;
				end--;
			}else {
				return false;
			}
		}
		return true;
	}

}
