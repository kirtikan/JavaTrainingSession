package Questions;

import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String names[] = {"Java", "JavaScript", "C", "Python", "Java", "C"}; 
		
		//1. using for loop: worst solution
//		for(int i=0; i<names.length; i++) {
//			for(int j=i+1;j<names.length;j++) {
//				if(names[i]==names[j])
//				System.out.println("Duplicate elements is :"+names[i]);
//			}
//		}
		
		//2. using HashSet: Collection: It contains unique values
//		Set<String> store = new HashSet<String>();
//		for(String name: names) {
//			if(store.add(name) == false) {
//				System.out.println("Duplicate value is :"+name);
//			}
//		}
		
		//3. using HashMap
		Map<String,Integer> storeMap = new HashMap<String,Integer>();
		
		for(String name:names) {
			if(storeMap.get(name)==null) {
				storeMap.put(name, 1);
			}
			else {
				storeMap.put(name, storeMap.get(name)+1);
			}
		}
		
		//get the values from HashMap
		Set<Entry<String,Integer>> entrySet = storeMap.entrySet();
		for(Entry<String,Integer> entry: entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate Elements is: "+entry.getKey());
			}
		}

	}

}
