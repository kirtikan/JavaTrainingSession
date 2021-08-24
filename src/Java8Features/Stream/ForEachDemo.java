package Java8Features.Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("murrit");
		list.add("john");
		list.add("peter");
		list.add("marek");
		list.add("mac");
		
		for(String s :list) {
			System.out.println(s);
		}
		
		System.out.println("*********Using forEach Method");
		list.stream().forEach(t->System.out.println(t));
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		
		map.forEach((key,value)->System.out.println(key+" :"+value));
	}
}
