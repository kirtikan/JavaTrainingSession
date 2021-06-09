package AbstractionConcept;

public abstract class B implements A{
	
	// when an abstract class implements an interface it define all or no methods but subclass of this abstract class should define 
	// all the methods which are non defined
	public void c() {
		System.out.println("I am C");
	}

}
