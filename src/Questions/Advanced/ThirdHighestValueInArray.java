package Questions.Advanced;

import java.util.TreeSet;

public class ThirdHighestValueInArray {
	
	public static void desiredOccuredValue(int[] ar) {
		//Arrays.sort(ar);
		//if you don't have duplicates, u can do it directly
		//System.out.println(ar[ar.length-3]);
		
		//if u have duplicates
		//HashSet<Integer> hSet = new HashSet<Integer>();
		//for(int m : ar) {
		//	hSet.add(m);
		//}
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for(Integer m : ar) {
			treeSet.add(m);
		}
		
		int counter=0;
		int desiredCounter=treeSet.size()-3;  //for 3rd highest
		for(Integer val : treeSet) {
			if(counter==desiredCounter) {
				System.out.println(val);
				break;
			}
			counter++;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,2,7,8,9,0};
		//List<Integer> list =Arrays.asList(arr);
		desiredOccuredValue(arr);
	}
}
