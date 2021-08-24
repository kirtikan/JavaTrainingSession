package Questions.Basic;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String str = "Java is best is java language";
		
		str=str.toLowerCase();
		char a[] = str.toCharArray();
		
		HashMap<Character,Integer> storeMap = new HashMap<Character,Integer>();
		
		for(char ltr: a) {
			if(storeMap.containsKey(ltr))
			{
				storeMap.put(ltr, storeMap.get(ltr)+1);
			}
			else {
				storeMap.put(ltr, 1);
			}
		}
		
		Set<Entry<Character,Integer>> eset= storeMap.entrySet();
		
		for(Entry<Character,Integer> entry: eset) {
			if(entry.getValue()>1)
			{
				System.out.println("Duplicate letter is :"+entry.getKey()+" :"+entry.getValue());
			}
		}

	}

}
