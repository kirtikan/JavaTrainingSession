package Questions.Advanced;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayMergeAndSort {
	public static void mergeAndSortFast(int[] a,int[] b) {
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		for(int i: a) {
			tSet.add(i);
		}
		for(int j: b) {
			tSet.add(j);
		}
		
		for(Integer m:tSet) {
			System.out.println("Printing sorted values: "+m);
		}
	}
	public static void mergeAndSort(int[] a,int[] b) {
		//using HashSet to remove duplicate
		Set<Integer> hSet = new HashSet<>();
		
		for(int i:a) {
			hSet.add(i);			
		}
		
		for(int j:b) {
			hSet.add(j);
		}
		
		//Now we have to sort
		int[] c = new int[hSet.size()];	
		int counter=0;
		for(Integer val: hSet) {
			c[counter]=val;
			counter++;
		}		
		Arrays.sort(c);
		
		//Printing Merged & Sorted Array
		for(int num: c) {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		int[] a1 = {1,4,2,5,0,7};
		int[] a2 = {1,3,8,3};
		
		mergeAndSort(a1, a2);
	}
}
