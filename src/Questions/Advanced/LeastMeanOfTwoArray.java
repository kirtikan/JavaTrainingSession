package Questions.Advanced;

import java.util.Arrays;

public class LeastMeanOfTwoArray {
	
	public static void leastMean(int[] A,int[] B) {
		Arrays.sort(A);
		Arrays.sort(B);
		
		int i=0;int j=0;
		int result=Integer.MAX_VALUE;
		int valOfA =0;
		int valOfB =0;
		
		while(i<A.length&&j<B.length) {
			if(Math.abs(A[i]-B[j])<result) {
				result=Math.abs(A[i]-B[j]);
				valOfA=A[i];
				valOfB=B[j];
			}
			
			if(A[i]<B[j])
				i++;
			else
				j++;
		}
		
		System.out.println("Least Mean is "+result+" of values "+valOfA+" and "+valOfB);
	}
	
	public static void main(String[] args) {
		int[] a= {1,5};
		int[] b= {0,9};
		
		leastMean(a,b);
	}
}
