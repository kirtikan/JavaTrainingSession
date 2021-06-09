package JavaBasics;

public class FinalizeConcept {
	
	public void finalize()
	{
		System.out.println("finalize method");
	}

	//finalize is a protected and non static method of java.lang.Object class.
	//this will be avl in all objects u createn in java
	//is used to perform cleanup operations on an object before it's removed
	// finalize is a method which is called just before a GC for cleanup process
	public static void main(String[] args) {
		

		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		// then two blank objects i.e. no one is reffering this
		// then GarbageCollector will be called automatically to destroy all these non reffering object to free some space in memory
		
		System.out.println("hhgjhjhj");
		System.gc(); // to manually call GarbageCollector
		
	}

}
