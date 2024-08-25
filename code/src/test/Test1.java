package test;

public class Test1 {
	
	public void add(int a, long b) {
		
	}
	
	public void add(long b,int a) {
		
	}
	
	public static void main (String [] args) {
		int x = 5;
		int y = 10;
		int z = ++x + y-- - --x;
		System.out.println(z);
		
      String s1 = "hello";
      System.out.println(s1.hashCode());
      s1 = s1 + "world";
      System.out.println(s1 +":"+ s1.hashCode());
	}

}
