package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	// global vars: the scope of global vars will be available across all the functions with some conditions
	
	String name = "Tom";  // non static global var
	static int age = 25;  // static global var
	
	public static void main(String[] args) {
		
		//how to call static methods and vars?
		//1. direct way
		sum();
		//2. calling by classname
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age );
		
		//how to call a non static method  or vars
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		//can i access static method by using object reference  - YES
		obj.sum(); // waring will be given but it's not a good practice as it is freely availbale in memory.
		
		
	}
	
	public void sendMail() // non static method
	{
		System.out.println("sendmail method");
	}

	public static void sum()  //static method
	{
		System.out.println("sum method");
	}
}
