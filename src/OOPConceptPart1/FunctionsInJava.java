package OOPConceptPart1;

public class FunctionsInJava {

	//main method ----> starting point of execution
	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		
		//method can't be created inside a method
		// one Object will be created, obj is the reference variable , referring to this object
		//after creating the object, the copy of all the non static methods will be given to this object
		//object can hold static method
		
		//to call a non static method of any class object is needed
		
	    obj.test();
	    int l = obj.pqr();
	    System.out.println(l);
	    
	    String ss = obj.qa();
	    System.out.println(ss);
	    
	    int q = obj.division(30,10);
	    System.out.println(q);
	    
	    // main method is void because it never returns a value
	}

	//non static methods
	
	//void --does not return any value
	//return type = void
	public void test() //no input, no output
	{
		System.out.println("test method");
	}
	
	// return type = int
	public int pqr() // no input,some output
	{
		System.out.println("pqr method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	//return type ---> String
	public String qa() //no input,some output
	{
		System.out.println("qa method");
		String s = "Selenium";
		return s;
	}
	
	//return type ---> int
	public int division(int x,int y) //some input,some output
	{
		System.out.println("division method");
		int d = x/y;
		return d;
	}
	
	
}
