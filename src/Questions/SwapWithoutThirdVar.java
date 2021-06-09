package Questions;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		int x=5;
		int y =10;
		
		//1. with using third var:
		int t;
		
//		t=x;
//		x=y;
//		y=t;
//		
//		//2. without using third var with + operator:
		x=x+y;
		y=x-y;
		x=x-y;
		
//		//3. without using third var with * operator:
//		x=x*y;
//		y=x/y;
//		x=x/y;
		
		//4. without using third var with XOR operator
//		x=x^y;
//		y=x^y;
//		x=x^y;
		
		System.out.println("value of x is :"+x);
		System.out.println("value of y is :"+y);

	}

}
