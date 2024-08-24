package code;

public class ReverseBit {

	public static void main(String[] args) throws InterruptedException {
		
		//00000010100101000001111010011100
		
		  // 0100
	    // 2^0 = 1 *0 =0 // 2^1 =2 *0 // 2^2 = 4 *1  // 2^3 = 8 *0
		
		int a = 19;
		// 194 /10 = 19  4
		// 19 / 10 = 1   9
		// 1/10   = 0   1
		int result=0;
		while(a>=3) {
			System.out.println("a : "+a);
			while(a > 0) {
				int ans = (a%10);
				result =result + ans*ans;
				System.out.println(result);
				a=a/10;
			}
			
			if(result==1) {
				System.out.println("got it : "+result);
				return;
			}else {
				a=result;
				result=0;
			}
			
			Thread.sleep(1000);
			
		}


	}

}
