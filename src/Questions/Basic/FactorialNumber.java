package Questions.Basic;

public class FactorialNumber {

	//fact of 3: 3*2*1
	//fact of 5: 5*4*3*2*1
	//fact of 1 : 1
	//fact of 0: 1
	
	//1. without recursive --- use for loop
	public static int factorial(int num) {
		int fact=1;
		if(num==0) {
			return 1;
		}
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	//2. with recursive method:    --- Recursive function -> a function calling itself
	public static int factorialRecursive(int num) {
		if(num==0)
			return 1;
		else
			return num * factorialRecursive(num-1);
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorialRecursive(3));
	}

}
