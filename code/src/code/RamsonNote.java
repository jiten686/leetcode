package code;

import java.util.HashMap;
import java.util.Map;

public class RamsonNote {

	public static void main(String[] args) {
		System.out.println(canConstruct("a","b"));

	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		
			for(Character c : magazine.toCharArray()) {
				map.compute(c, (k,v)-> v==null ? 1 : v+1);
				
			}
		
		for(Character c : ransomNote.toCharArray()) {
			if(map.get(c)!=0)
				return false;
		}
		
		return true;
	}

}
