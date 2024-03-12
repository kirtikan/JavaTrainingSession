package JavaBasics;

public class ThrowsKeyword {

	//JVM will caught any error if it throwing by a main method
	// Throws used in front of the method name
	
	public static void main(String[] args) // throws ArithmeticException
	{
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("ABC");
	}
	
	public void sum() //throws ArithmeticException
	{
		try {div();
		}
		catch(ArithmeticException e) {
			//e.printStackTrace();
		}
		
	}
	
	public void div() throws ArithmeticException{
		int i = 9/0;  //exception line
	}

}
