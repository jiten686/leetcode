package code;

import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		String s="{)[])}";
		System.out.println(isValid(s));

	}

	private static boolean isValid(String s) {
		Stack<Character> stack =new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			if(stack.isEmpty()) {
				stack.add(s.charAt(i));
			}else if(stack.peek()==checkClosedOne(s.charAt(i))) {
				stack.pop();
			}else {
				stack.add(s.charAt(i));
			}
		}
		return stack.isEmpty();
	}
	
	private static Character checkClosedOne(char c) {
		if(c==')')
			return '(';
		if(c==']')
			return '[';
		if(c=='}')
			return '{';
		return null;
		
	}

}
	
