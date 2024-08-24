package code;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		System.out.println(wordPattern("abba","dog cat cat fish"));

	}

	private static boolean wordPattern(String pattern, String s) {
		char[] arr = pattern.toCharArray();
		String[] str =  s.split(" ");
		
		if(str.length != arr.length)
			return false;
		
		Map<Character, String> map = new HashMap<>();
		
		for(int i =0; i<str.length ;i++) {
			if(map.containsKey(arr[i])) {
				if(!map.get(arr[i]).equals(str[i]))
					return false;
			}else {
				if(map.containsValue(str[i]))
                    return false;
				map.put(arr[i], str[i]);
			}
		}
		
		
		return true;
	}

}
