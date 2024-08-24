package ArrayString;

public class LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("luffy is still joyboy"));

	}
	
	 public static int lengthOfLastWord(String s) {
//		 s = s.trim().split("\\s+");
		String[] arr = s.trim().split("\\s+");
		int length = arr.length;
	
		 return arr[length-1].length();
	  } 

}
