package Questions.Advanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class HighestCharacterInString {

	public static void highestOccuredCharacter(String str) {
		str=str.toLowerCase().replaceAll("\\s", "");
		char[] charArray =str.toCharArray();
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char ch : charArray) {
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		
//		int max=0;	
//		for(Entry<Character,Integer> entry :hm.entrySet()) {
//			if(entry.getValue()>max) {
//				max=entry.getValue();
//			}
//		}
		
		TreeSet<Integer> tset = new TreeSet<Integer>(hm.values());
		ArrayList<Integer> arrL = new ArrayList<Integer>(tset);
		int max=arrL.get(arrL.size()-1);
		
		for(Entry<Character,Integer> en : hm.entrySet()) {
			if(en.getValue()==max) {
				System.out.println("Maximun occured Character is :"+en.getKey()+" and it's no. of occurance is: "+en.getValue());
			}
		}		
	}
	
	public static void main(String[] args) {
		String str ="selenium is used automating browser";
		highestOccuredCharacter(str);
	}
}
