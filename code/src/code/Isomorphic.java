package code;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {

	public static void main(String[] args) {
		
		System.out.println(isIsomorphic("badc","baba"));
	}
	
	public static boolean isIsomorphic(String s, String t) {
		if(s.length() != t.length())
			return false;
		
		Map<Character, Character>map = new HashMap<>();
		for(int i=0; i<s.length();i++) {
			char org = s.charAt(i);
			char repl = t.charAt(i);
			
			if(map.containsKey(org)) {
				if(repl!=map.get(org))
					return false;
	
			}else {
				if(map.containsValue(repl)) {
					return false;
				}else {
					map.put(org, repl);	
				}
			}
		}
		
		
		return true;
	}

	private static boolean checkIsomorphic(String s, String t) {
		Map<Character, Character>map = new HashMap<>();
		int i = 0;
		while(i < s.length()) {	
			if(map.containsKey(s.charAt(i))) {			
				if(map.get(s.charAt(i))!=t.charAt(i))
					return false;
				
			}else {
				map.put(s.charAt(i), t.charAt(i));
			}
			
			i++;
		}
		return true;
	}

}
