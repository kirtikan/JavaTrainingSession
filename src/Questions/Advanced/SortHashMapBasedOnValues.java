package Questions.Advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortHashMapBasedOnValues {

	public static void duplicateCharactersBySortedValues(String str) {
		
		str=str.toLowerCase().replaceAll("\\s", "");
		
		char[] charArray =str.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char word: charArray) {
			if(hm.containsKey(word)) {
				hm.put(word, hm.get(word)+1);
			}else {
				hm.put(word, 1);
			}
		}
		
		//TreeSet<Integer> t = new TreeSet<Integer>(hm.values());
		
		List<Integer> list = new ArrayList<Integer>(hm.values());		
//		for(Entry<Character,Integer> val :hm.entrySet()) {
//			list.add(val.getValue());
//		}
		Collections.sort(list);

		//through Comparator
//		Collections.sort(list, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {			
//				return o1.compareTo(o2);
//			}			
//		});
		
		LinkedHashMap<Character,Integer> linkedMap = new LinkedHashMap<Character,Integer>();
		
		for(Integer m: list) {			
			for(Entry<Character,Integer> val : hm.entrySet()) {
				if(val.getValue().equals(m)) {
					linkedMap.put(val.getKey(), val.getValue());
				}
			}
		}//end list iteration
		
		for(Entry<Character,Integer> entry : linkedMap.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	
	public static void sortThroughComparatorJava8(Map<Character, Integer> hm){
		Map<Character, Integer> sortedMap = hm.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry<Character, Integer>::getKey,
		Map.Entry<Character, Integer>::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));

		System.out.println("Sorted Map by Value");
		for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
		System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		String str ="My Name is kirti an my ii";
		duplicateCharactersBySortedValues(str);
	}
}
