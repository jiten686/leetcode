package code;

import java.util.Map;

public class IsSubSequence {

	public static void main(String[] args) {
		System.out.println(isSubSequence("acb","ahbgdc"));

	}

	private static boolean isSubSequence(String s, String t) {
        int i=0, j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }

        return(i==s.length());
	}


}
