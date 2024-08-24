package test.Emp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import test.Employee;
import test.Person;

public class Test {

	public static void main(String[] args) {
//		Person p = new Employee();
////		Person p = new Person();
//		p.show();

		
		
//		List<String> list = Arrays.asList("Kanad","Kokila","Rohit","Virak","Kunal");
//		
//		System.out.println(list.stream().filter(e -> e.startsWith("K")).count());
		
		
//		List<Integer>list = Arrays.asList(10,20,30,40);
//		
//		System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
		
		
		List<String> list = Arrays.asList("Kanad","Kokila","Rohit","Virak","Kunal","Kanad","Kunal");
		
		
		System.out.println(list.stream().collect(Collectors.groupingBy(String::toString,Collectors.counting())));
		
		
		int number = 12345;
		
		System.out.println(Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).sum());
		
		List<String> list1 = Arrays.asList("Kanad","Kokila","Rohit","Virak","Kunal","Kunal");
		List<String> list2 = Arrays.asList("Kanad","Kokila");
		
		
		list1.stream().filter(e -> list2.contains(e)).forEach(System.out::println);
		
		
		List<String> list3 = Arrays.asList("abcd","abcasdsadsa","ab");
		
		list3.stream().sorted((e1,e2) -> {
			return e2.length() - e1.length();
		}).forEach(System.out::println);
		
		
//		list3.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}

}
