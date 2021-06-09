package JavaBasics;

public class FinallyConcept {

	public static void main(String[] args) {
		
		//test1();
		//test2();
		division();

	}
	
	//finally is a block used in association with try-catch block.
	// Whatever the code is written inside the finally block, it will be executed.
	//Ex: driver.quit or DB close Conncetion can be written in finally
	
	public static void test1() {
		
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}
		catch(Exception e){
			System.out.println("inside catch block");
		}
		
		finally {
			System.out.println("inside finally block");
		}		
	}
	
	public static void test2() {
		try {
			System.out.println("inside test2 method");
		}
		finally {
			System.out.println("inside finally block----test2 method");
		}		
	}
	
	public static void division() {
		int i=10;
		try {
			System.out.println("inside try block");
			int k = i/0;
		}
		catch(NullPointerException e) {  //catching of error is not proper as this is ArithmaticException but we are catching this in NullPointerException
			System.out.println("inside catch block");
			System.out.println("divide by zero error");
		}
		/*
		catch(ArithmeticException e) {
			System.out.println("inside catch block");
			System.out.println("divide by zero error");
		}*/
		
		finally {
			System.out.println("execute this code even after any exception");
		}
	}
	
}
