import java.util.HashSet;
import java.util.Set;

public class delete {

	public static void main(String[] args) throws InterruptedException {

		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		
		Object obj = new Object();
		obj.wait();
	}

	public static int lengthOfLongestSubstring(String s) {
        // Create a set to store unique characters
        Set<Character> set = new HashSet<>();
        
        int left = 0;
        int right = 0;
        int maxLen = 0;
        
        // Slide the window
        while (right < s.length()) {
            // If the current character is not in the set, add it to the set and expand the window
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLen = Math.max(maxLen, right - left);
            } else {
                // If the current character is in the set, remove the leftmost character from the set
                set.remove(s.charAt(left));
                left++;
            }
        }
        
        return maxLen;
    }

}
