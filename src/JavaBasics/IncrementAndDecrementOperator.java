package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
	//++
	//--
		
		int i =1;
		int j=i++; //post increment
		
		System.out.println("value of i: "+i);
		System.out.println("value of j: "+j);
		
		int a=1;
		int b=++a; //pre increment
		
		System.out.println("value of a: "+a);
		System.out.println("value of b: "+b);
		
		int m=2;
		int n=m--; //post decrement
		
		System.out.println("value of m: "+m);
		System.out.println("value of n: "+n);
		
		int p=2;
		int q=--p; //pre decrement
		
		System.out.println("value of p: "+p);
		System.out.println("value of q: "+q);
	}

}
