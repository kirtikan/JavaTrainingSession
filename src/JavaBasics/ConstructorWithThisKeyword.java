package JavaBasics;

public class ConstructorWithThisKeyword {

	//class variables or global variables 
	String name;
	int age;
	
	//we can't use default construct in object creation if we had mentioned only parameterized constructor in a class
	// this keyword is used to initialize global variables inside a constructor
	// this keyword refer to current class variables
	
	public ConstructorWithThisKeyword(String name,int age) {
		this.name = name;  // this.classvar = localvar
		this.age = age;
				System.out.println(name);
				System.out.println(age);
	}

	public static void main(String[] args) {
		
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",30);
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

}
