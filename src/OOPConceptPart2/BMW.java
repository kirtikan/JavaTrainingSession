package OOPConceptPart2;

public class BMW extends Car{  //"has-a-relationship"
	
	
	// when same method is present in parent as well as in child class with the same name and no. of arguments, is 
	// as method overriding
	public void start()  // preference will be given to overidden method
	{
		System.out.println("BMW-----Start");
	}
	
	public void theftSafety()
	{
		System.out.println("BMW---theftSafety");
	}

}
