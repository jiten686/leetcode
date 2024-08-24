package ArrayString;

public class ZigZag {
	/*
	 * Input: s = "PAYPALISHIRING", numRows = 4
		Output: "PINALSIGYAHRPI"
		Explanation:
		P     I    N
		A   L S  I G
		Y A   H R
		P     I
	 */
	
	
	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING",4));
	}
	
    public static String convert(String s, int numRows) {
    	
    	StringBuilder ans = new StringBuilder();
    	
        StringBuilder [] rows = new StringBuilder[numRows];
        
       for(int i=0;i<numRows;i++) {
    	   rows[i] = new StringBuilder();
       }
        
        boolean isUp = false;
        int shift=1;
        
        for (int i=0;i<s.length();i++) {
        	
        	if(shift == numRows) {
        		isUp = !isUp;
        	}else if(shift == 1) {
        		isUp = false;
        	}
        	
        	if(!isUp) {
            	rows[shift-1].append(s.charAt(i));
            	shift++;
        	}else {
        		shift--;
        		rows[shift].append(s.charAt(i));
        	}

        	
        
        }
        
       
       for(StringBuilder row : rows) {
    	   ans.append(row);
       }
        
        
    	
    	return ans.toString();
    	
    }

}
