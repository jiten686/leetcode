package code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseTheWordsInString {

	public static void main(String[] args) {
//		System.out.println(reverseWords("the sky is blue"));
//		System.out.println(reverseWords("  hello world  "));
		System.out.println(reverseWords("a good   example"));

	}

//	private static String reverseWords(String s) {
//		List<String> words = Arrays.asList(s.split(" "));
//        Collections.reverse(words);
//        return words.stream()
//                    .filter(e -> !e.equals(""))
//                    .collect(Collectors.joining(" "));
//		
//		
//	}

	private static String reverseWords(String s) {
		String[] words = s.trim().split("\\s+");

		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]);
			if (i != 0)
				sb.append(" ");
		}

		return sb.toString();

	}

}
