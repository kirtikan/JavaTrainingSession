package AbstractionConcept;

public abstract class Bank {
	
	///partial abstraction /// BECAUSE on non abstract methods
	//Abstraction is a process of hiding the implementation
	//Ways to achieve abstraction:
	// 1. Abstract class(0 to 100 %)
	// 2. Interface (100%)
	
	// in an abstract class u can have one abstract methods or non abstract methods (method with the body)
	// we cannot create the object of abstract class
	// a sub class should  define All abstract method
	// abstract class can have constructor and static method also.
	// can have final methods which will force the subclass not to change the body of the method
	// The abstract class can also be used to provide some implementation of the interface. In such case, 
	//the end user may not be forced to override all the methods of the interface.
	
	//Performances Abstraction is fast wrt interface
	
	int amt = 100;
	static int val = 10;
	final int rate = 10;
	
	
	public abstract void loan(); // abstract method -- no method body 
	
	public void credit() {
		System.out.println("bank----------credit");  //non abstract methods
	}

	public void debit() {
		System.out.println("bank-----------debit"); //non abstract methods
	}
}
