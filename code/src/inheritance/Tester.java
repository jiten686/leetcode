package inheritance;

import java.util.Arrays;

public class Tester {
	public static void main(String[] args) {
		Person p = new Student("Tushar", "Jagtap", "CDAC", 87000, 78, "DAC");
		System.out.println(p.toString());
		
//		Student s = (Student)new Person("KK", "bb");
		int[] num = {1,1,2,5,6,2,7,7};
		int size = num.length;
		int index = 1;
		for (int i = 1 ; i < size ; i++) {
			boolean isDup = false;
			for (int j = 0 ; j < index ; j++) {
				if (num[i] == num[j]) {
					isDup = true;
					break;
				}
				
			}
			
			if(!isDup) {
				if(index != i) {
					num[index] = num[i];
				}
				index++;
			}
		}
		
		int[] newUniqueArray = new int[index];
		for(int k = 0; k < index ; k++) {
			newUniqueArray[k] = num[k];
		}
		System.out.println(Arrays.toString(newUniqueArray));
	}
}
