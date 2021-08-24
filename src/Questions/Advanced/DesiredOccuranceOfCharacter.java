package Questions.Advanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class DesiredOccuranceOfCharacter {

	public static void desiredOccuranceOfCharacterInString(String str) {
		str=str.toLowerCase().replaceAll("\\s", "");
		char[] charArray = str.toCharArray();		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char ch : charArray) {
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		
		//Now we have to sort values in HashMap
		//ArrayList<Integer> valArrayList = new ArrayList<Integer>(hm.values());
		//Collections.sort(valArrayList);
		
		//To remove duplicates
		//LinkedHashSet<Integer> linkSet = new LinkedHashSet<Integer>(valArrayList);
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>(hm.values());
		
		ArrayList<Integer> finalArr = new ArrayList<Integer>(treeSet);
		int desiredValue=finalArr.get(finalArr.size()-2);  //for 2nd Highest Value
		
//		int desiredIndex = treeSet.size()-2;
//		int counter=0;
//		int desiredValue = 0;		
//		for(Integer m :treeSet) {
//			if(counter==desiredIndex) {
//				desiredValue=m;
//			}
//			counter++;			
//		}
		
		for(Entry<Character,Integer> entry: hm.entrySet()) {
			if(entry.getValue()==desiredValue) {
				System.out.println("2nd Highest Occured Character is :"+entry.getKey()+" with No. of occurance is :"+entry.getValue());
			}
		}
	}
	
	public static void main(String[] args) {
		String strNew = "My Name is kirti an my ii";
		desiredOccuranceOfCharacterInString(strNew);
	}
}
