package JavaBasics;

public class ExceptionHandling {
	
	//int a =10;
	//static ExceptionHandling obj;
	
	public static void main(String[] args) {
		
		//uncaught exception
		//int i = 9/0;
		//System.out.println(i);
		
		//caught exception: when hint is dere
		//Thread.sleep(2000);
		
		//ExceptionHandling obj = new ExceptionHandling();
		//obj= null;
		//System.out.println(obj.a);  //null pointer exception
		
		//*Throwable is the super class of Error and Exception 
		// Object is the super class of all the classes
		
		//1. try-catch block:
		try
		{
			int i =9/0; //this code will give an error
		}
		catch(ArithmeticException e){   // we can also write (Error e) or (Throwable e) -- best to use  or (Exception e)
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("ABC");

	}

}
