package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);
	}

	public static void main(int p)
	{}
	
	// we can overload main method also
	
	//method can't be created inside a method
	//same name method with similar parameters are not allowed
	
	//Method Overloading:---> when the method name is same with diff input parameters/arguments with diff datatypes within the same class
	
	public void sum()  // 0 param
	{
		System.out.println("sum method----zero param");
	}
	
	public void sum(int i)  // 1 param
	{System.out.println("some method---1 param");
	System.out.println(i);
	}
	
	public void sum(int j,int k)  // 2 param
	{System.out.println("some method ---2 param");
	System.out.println(j+k);
	}
}
