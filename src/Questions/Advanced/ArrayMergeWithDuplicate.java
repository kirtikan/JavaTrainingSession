package Questions.Advanced;

import java.util.Arrays;

public class ArrayMergeWithDuplicate {

	public static void main(String[] args) {
		int a[] = {7,3,8,10,7,8};
		int b[] = {6,5,1};
		
		int c[] = new int[a.length+b.length];
		
		for(int j=0; j<a.length; j++) {
			c[j]=a[j];
		}
				
		for(int i=0; i<b.length; i++) {		
			c[a.length+i]=b[i];
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));			
	}

}
