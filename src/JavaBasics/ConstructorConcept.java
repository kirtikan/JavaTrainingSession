package JavaBasics;

public class ConstructorConcept {
	//before creating object to define features of class in terms of global variables :: constructor
	//constructor look like a method, they can't return any value
	//constructor name should be same as class name
	// the moment u create object of a class immediately constructor will be called
	//constructor can also be used to intialize the object 
	
	public ConstructorConcept() {// 0 param constructor
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept( int i) {// 1 param constructor
		System.out.println("Single param Constructor");
		System.out.println("value of i: "+i);
	}
	
	public ConstructorConcept(int i, int j) {// 2 param constructor
		System.out.println("Two param Constructor");
		System.out.println("value of i: "+i);
		System.out.println("value of j: "+j);
	}
	// we can overload constructor i.e. constructor overloading
	
	public static void main(String[] args) {	
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(20,30);		
	}
}
