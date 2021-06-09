package OOPConceptPart2;

public class Singleton {

	//In OOP, a singleton class is a class that can have only one object of the class (instance of the class) at a time.
	//How to design a Singleton class:
	// 1.Initialize object reference of this class as null  by making it static and private.
	// 2.make constructor as private
	// 3.write a public static method(getInstance) that has a return type of object of this singleton class(Lazy Initialization).
	
	//Difference B/w normal class and singleton class:
	// for normal class we use constructor whereas in singleton class we use getInstance() method for instantiation.
	
	private static Singleton singleton_instance = null;
	public String str;
	
	private Singleton() {
		str = "Hey, I am Java Developer.";
	}
	
	public static Singleton getInstance() {
		 if(singleton_instance == null)
			 singleton_instance = new Singleton();
			return singleton_instance; 
	}
	
	public static void main(String[] args) {
		
		Singleton x =Singleton.getInstance();
		Singleton y =Singleton.getInstance();
		Singleton z =Singleton.getInstance();
		
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str = (z.str).toLowerCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
