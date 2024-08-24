package code;

public class Sqrt {

	public static void main(String[] args) {
		System.out.println(squrt(64));

	}

	private static int squrt(int num) {
		if(num==0 || num==1)
			return num;
		
		int start=1;
		int mid=-1;
		int end=num;
		
		while(start<=end) {
			mid = start + (end - start) /2;
			
			if((long)mid*mid > (long) num) {
				end = mid-1;
			}else if((long)mid*mid==(long)num)
				return mid;
			else {
				start=mid+1;
			}
			
		}
		
		return Math.round(end);
	}

}
