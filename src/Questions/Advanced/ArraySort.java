package Questions.Advanced;

import java.util.Arrays;

public class ArraySort {

	public static void normalArraySort(int[] a) {

		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}		
		for(int n: a) {
			System.out.println(n);
		}
	}
	
	public static void sortUsingArray(int[] a) {
		Arrays.sort(a);
				
		for(int n: a) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		
		int ar[] = {8,5,6,3,2,9,1,0,4,7};
		
		//normalArraySort(ar);
		sortUsingArray(ar);
		
	}
}
