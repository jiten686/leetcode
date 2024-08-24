package test;

public class Test1 {
	public static void main (String [] args) {
		int x = 5;
		int y = 10;
		int z = ++x + y-- - --x;
		System.out.println(z);
		
		//6+10-5 =
		
//		int x = 5;
//		int result = 0;
//		result = ((x++) + ((++x) *(--x)) - (x--));
//		System.out.println("result"+result);
	}

}
